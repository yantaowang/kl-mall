package com.kl.user.service.service.impl;

import com.kl.user.api.model.UmsPermission;
import com.kl.user.api.model.UmsPermissionExample;
import com.kl.user.api.dto.UmsPermissionNode;
import com.kl.user.api.dversion.UserApiVersion;
import com.kl.user.api.service.UmsPermissionService;
import com.kl.user.service.data.UmsPermissionMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台用户权限管理Service实现类
 * Created on 2018/9/29.
 */
@DubboService(version = UserApiVersion.VERSION_1, group = UserApiVersion.GROUP_KL)
public class UmsPermissionServiceImpl implements UmsPermissionService {
    @Resource
    private UmsPermissionMapper permissionMapper;

    @Override
    public int create(UmsPermission permission) {
        permission.setStatus(1);
        permission.setCreateTime(new Date());
        permission.setSort(0);
        return permissionMapper.insert(permission);
    }

    @Override
    public int update(Long id, UmsPermission permission) {
        permission.setId(id);
        return permissionMapper.updateByPrimaryKey(permission);
    }

    @Override
    public int delete(List<Long> ids) {
        UmsPermissionExample example = new UmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return permissionMapper.deleteByExample(example);
    }

    @Override
    public List<UmsPermissionNode> treeList() {
        List<UmsPermission> permissionList = permissionMapper.selectByExample(new UmsPermissionExample());
        List<UmsPermissionNode> result = permissionList.stream()
                .filter(permission -> permission.getPid().equals(0L))
                .map(permission -> covert(permission,permissionList)).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<UmsPermission> list() {
        return permissionMapper.selectByExample(new UmsPermissionExample());
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候map操作不会再递归调用covert
     */
    private UmsPermissionNode covert(UmsPermission permission,List<UmsPermission> permissionList){
        UmsPermissionNode node = new UmsPermissionNode();
        BeanUtils.copyProperties(permission,node);
        List<UmsPermissionNode> children = permissionList.stream()
                .filter(subPermission -> subPermission.getPid().equals(permission.getId()))
                .map(subPermission -> covert(subPermission,permissionList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
