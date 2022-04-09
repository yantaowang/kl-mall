package com.kl.other.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.other.api.model.SmsFlashPromotionLog;
import com.kl.other.api.model.SmsFlashPromotionLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsFlashPromotionLogMapper extends BaseMapper<SmsFlashPromotionLog> {
    long countByExample(SmsFlashPromotionLogExample example);

    int deleteByExample(SmsFlashPromotionLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    List<SmsFlashPromotionLog> selectByExample(SmsFlashPromotionLogExample example);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    int updateByExample(@Param("record") SmsFlashPromotionLog record, @Param("example") SmsFlashPromotionLogExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}