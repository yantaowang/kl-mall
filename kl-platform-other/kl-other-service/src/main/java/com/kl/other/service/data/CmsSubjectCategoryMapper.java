package com.kl.other.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.other.api.model.CmsSubjectCategory;
import com.kl.other.api.model.CmsSubjectCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsSubjectCategoryMapper extends BaseMapper<CmsSubjectCategory> {
    long countByExample(CmsSubjectCategoryExample example);

    int deleteByExample(CmsSubjectCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSubjectCategory record);

    int insertSelective(CmsSubjectCategory record);

    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    CmsSubjectCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    int updateByExample(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    int updateByPrimaryKey(CmsSubjectCategory record);
}