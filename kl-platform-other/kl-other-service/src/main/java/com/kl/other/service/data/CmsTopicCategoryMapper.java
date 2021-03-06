package com.kl.other.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.other.api.model.CmsTopicCategory;
import com.kl.other.api.model.CmsTopicCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTopicCategoryMapper extends BaseMapper<CmsTopicCategory> {
    long countByExample(CmsTopicCategoryExample example);

    int deleteByExample(CmsTopicCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory record);

    int insertSelective(CmsTopicCategory record);

    List<CmsTopicCategory> selectByExample(CmsTopicCategoryExample example);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    int updateByExample(@Param("record") CmsTopicCategory record, @Param("example") CmsTopicCategoryExample example);

    int updateByPrimaryKeySelective(CmsTopicCategory record);

    int updateByPrimaryKey(CmsTopicCategory record);
}