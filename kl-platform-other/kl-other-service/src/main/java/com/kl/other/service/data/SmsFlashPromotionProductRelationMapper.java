package com.kl.other.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.other.api.dto.SmsFlashPromotionProduct;
import com.kl.other.api.model.SmsFlashPromotionProductRelation;
import com.kl.other.api.model.SmsFlashPromotionProductRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsFlashPromotionProductRelationMapper extends BaseMapper<SmsFlashPromotionProductRelation> {
    long countByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByExample(SmsFlashPromotionProductRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsFlashPromotionProductRelation record);

    int insertSelective(SmsFlashPromotionProductRelation record);

    List<SmsFlashPromotionProductRelation> selectByExample(SmsFlashPromotionProductRelationExample example);

    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByExample(@Param("record") SmsFlashPromotionProductRelation record, @Param("example") SmsFlashPromotionProductRelationExample example);

    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);

    /**
     * 获取限时购及相关商品信息
     */
    List<SmsFlashPromotionProduct> getList(@Param("flashPromotionId") Long flashPromotionId, @Param("flashPromotionSessionId") Long flashPromotionSessionId);
}