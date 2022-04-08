package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsRoleMenuRelation;
import com.kl.user.api.model.UmsRoleMenuRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsRoleMenuRelationMapper extends BaseMapper<UmsRoleMenuRelation> {
    long countByExample(UmsRoleMenuRelationExample example);

    int deleteByExample(UmsRoleMenuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleMenuRelation record);

    int insertSelective(UmsRoleMenuRelation record);

    List<UmsRoleMenuRelation> selectByExample(UmsRoleMenuRelationExample example);

    UmsRoleMenuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    int updateByExample(@Param("record") UmsRoleMenuRelation record, @Param("example") UmsRoleMenuRelationExample example);

    int updateByPrimaryKeySelective(UmsRoleMenuRelation record);

    int updateByPrimaryKey(UmsRoleMenuRelation record);
}