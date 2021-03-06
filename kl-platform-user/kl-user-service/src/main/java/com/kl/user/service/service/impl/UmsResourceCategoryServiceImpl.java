package com.kl.user.service.service.impl;

import com.kl.user.api.dversion.UserApiVersion;
import com.kl.user.api.service.UmsResourceCategoryService;
import com.kl.user.service.data.UmsResourceCategoryMapper;
import com.kl.user.api.model.UmsResourceCategory;
import com.kl.user.api.model.UmsResourceCategoryExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 后台资源分类管理Service实现类
 * Created by macro on 2020/2/5.
 */
@DubboService(version = UserApiVersion.VERSION_1, group = UserApiVersion.GROUP_KL)
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Resource
    private UmsResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int delete(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }
}
