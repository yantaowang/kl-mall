package com.kl.other.service.service;

import com.github.pagehelper.PageHelper;
import com.kl.other.api.dversion.OtherApiVersion;
import com.kl.other.service.data.CmsSubjectMapper;
import com.kl.other.api.model.CmsSubject;
import com.kl.other.api.model.CmsSubjectExample;
import com.kl.other.api.service.CmsSubjectService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品专题管理Service实现类
 * Created by macro on 2018/6/1.
 */
@DubboService(version = OtherApiVersion.VERSION_1, group = OtherApiVersion.GROUP_KL)
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
