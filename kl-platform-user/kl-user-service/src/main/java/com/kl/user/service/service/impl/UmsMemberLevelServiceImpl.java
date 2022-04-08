package com.kl.user.service.service.impl;

import com.kl.user.api.dversion.UserApiVersion;
import com.kl.user.api.service.UmsMemberLevelService;
import com.kl.user.service.data.UmsMemberLevelMapper;
import com.kl.user.api.model.UmsMemberLevel;
import com.kl.user.api.model.UmsMemberLevelExample;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created by macro on 2018/4/26.
 */
@DubboService(version = UserApiVersion.VERSION_1, group = UserApiVersion.GROUP_KL)
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Resource
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
