package com.kl.other.service.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.kl.other.api.dversion.OtherApiVersion;
import com.kl.other.api.model.CmsSubjectProductRelation;
import com.kl.other.api.service.CmsSubjectProductRelationService;
import com.kl.other.service.data.CmsSubjectProductRelationMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(version = OtherApiVersion.VERSION_1, group = OtherApiVersion.GROUP_KL)
public class CmsSubjectProductRelationServiceImpl implements CmsSubjectProductRelationService {

    @Autowired
    private CmsSubjectProductRelationMapper cmsSubjectProductRelationMapper;

    @Override
    public void insertList(List<CmsSubjectProductRelation> cmsSubjectProductRelationList,Long productId) {
        cmsSubjectProductRelationMapper.delete(new LambdaQueryWrapper<CmsSubjectProductRelation>()
                                                   .eq(CmsSubjectProductRelation::getProductId, productId));
        cmsSubjectProductRelationList.forEach(item -> {
            item.setId(null);
            item.setProductId(productId);
        });
        cmsSubjectProductRelationMapper.insertList(cmsSubjectProductRelationList);
    }
}
