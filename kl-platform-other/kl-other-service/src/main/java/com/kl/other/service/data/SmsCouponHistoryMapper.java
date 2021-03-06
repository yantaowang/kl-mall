package com.kl.other.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.other.api.model.SmsCouponHistory;
import com.kl.other.api.model.SmsCouponHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsCouponHistoryMapper extends BaseMapper<SmsCouponHistory> {
    long countByExample(SmsCouponHistoryExample example);

    int deleteByExample(SmsCouponHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    List<SmsCouponHistory> selectByExample(SmsCouponHistoryExample example);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByExample(@Param("record") SmsCouponHistory record, @Param("example") SmsCouponHistoryExample example);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);
}