package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsMemberTag;
import com.kl.user.api.model.UmsMemberTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberTagMapper extends BaseMapper<UmsMemberTag> {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);
}