package com.kl.other.service.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.kl.other.api.dversion.OtherApiVersion;
import com.kl.other.api.model.CmsPrefrenceAreaProductRelation;
import com.kl.other.api.service.CmsPrefrenceAreaProductRelationService;
import com.kl.other.service.data.CmsPrefrenceAreaProductRelationMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(version = OtherApiVersion.VERSION_1, group = OtherApiVersion.GROUP_KL)
public class CmsPrefrenceAreaProductRelationServiceImpl implements CmsPrefrenceAreaProductRelationService {

    @Autowired
    private CmsPrefrenceAreaProductRelationMapper cmsPrefrenceAreaProductRelationMapper;

    @Override
    public void insertList(List<CmsPrefrenceAreaProductRelation> cmsPrefrenceAreaProductRelationList, Long productId) {
        cmsPrefrenceAreaProductRelationMapper.delete(new LambdaQueryWrapper<CmsPrefrenceAreaProductRelation>()
                .eq(CmsPrefrenceAreaProductRelation::getProductId, productId));
        cmsPrefrenceAreaProductRelationList.forEach(item -> {
            item.setId(null);
            item.setProductId(productId);
        });
        cmsPrefrenceAreaProductRelationMapper.insertList(cmsPrefrenceAreaProductRelationList);
    }
}
