package com.kl.other.api.service;

import com.kl.other.api.model.CmsPrefrenceAreaProductRelation;

import java.util.List;

public interface CmsPrefrenceAreaProductRelationService {

    void insertList(List<CmsPrefrenceAreaProductRelation> cmsPrefrenceAreaProductRelationList, Long productId);
}
