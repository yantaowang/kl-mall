package com.kl.platform.manager.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.kl.other.api.dversion.OtherApiVersion;
import com.kl.other.api.model.CmsPrefrenceAreaProductRelation;
import com.kl.other.api.model.CmsSubjectProductRelation;
import com.kl.other.api.service.CmsPrefrenceAreaProductRelationService;
import com.kl.other.api.service.CmsSubjectProductRelationService;
import com.kl.platform.manager.service.ProductService;
import com.kl.product.api.dto.PmsProductParam;
import com.kl.product.api.dversion.ProductApiVersion;
import com.kl.product.api.service.PmsProductService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @DubboReference(version = ProductApiVersion.VERSION_1,group = ProductApiVersion.GROUP_KL)
    private PmsProductService productService;

    @DubboReference(version = OtherApiVersion.VERSION_1,group = OtherApiVersion.GROUP_KL)
    private CmsSubjectProductRelationService cmsSubjectProductRelationService;

    @DubboReference(version = OtherApiVersion.VERSION_1,group = OtherApiVersion.GROUP_KL)
    private CmsPrefrenceAreaProductRelationService cmsPrefrenceAreaProductRelationService;

    @Override
    public int update(Long id, PmsProductParam productParam) {
        int count = productService.update(id,productParam);
        //关联专题
        cmsSubjectProductRelationService.insertList(BeanUtil.copyToList(productParam.getSubjectProductRelationList(), CmsSubjectProductRelation.class), id);
        cmsPrefrenceAreaProductRelationService.insertList(BeanUtil.copyToList(productParam.getPrefrenceAreaProductRelationList(), CmsPrefrenceAreaProductRelation.class), id);
        return count;
    }
}
