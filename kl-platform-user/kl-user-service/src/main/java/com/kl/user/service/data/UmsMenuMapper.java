package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsMenu;
import com.kl.user.api.model.UmsMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMenuMapper extends BaseMapper<UmsMenu> {
    long countByExample(UmsMenuExample example);

    int deleteByExample(UmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMenu record);

    int insertSelective(UmsMenu record);

    List<UmsMenu> selectByExample(UmsMenuExample example);

    UmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int updateByExample(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int updateByPrimaryKeySelective(UmsMenu record);

    int updateByPrimaryKey(UmsMenu record);
}