package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsMemberStatisticsInfo;
import com.kl.user.api.model.UmsMemberStatisticsInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberStatisticsInfoMapper extends BaseMapper<UmsMemberStatisticsInfo> {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}