package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsResourceCategory;
import com.kl.user.api.model.UmsResourceCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsResourceCategoryMapper extends BaseMapper<UmsResourceCategory> {
    long countByExample(UmsResourceCategoryExample example);

    int deleteByExample(UmsResourceCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory record);

    int insertSelective(UmsResourceCategory record);

    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int updateByExample(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int updateByPrimaryKeySelective(UmsResourceCategory record);

    int updateByPrimaryKey(UmsResourceCategory record);
}