package com.kl.other.api.service;

import com.kl.other.api.model.CmsSubjectProductRelation;

import java.util.List;

public interface CmsSubjectProductRelationService {
    /**
     * 批量插入
     * @param cmsSubjectProductRelationList
     */
    void insertList(List<CmsSubjectProductRelation> cmsSubjectProductRelationList, Long productId);
}
