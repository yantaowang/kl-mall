package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsMemberRuleSetting;
import com.kl.user.api.model.UmsMemberRuleSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberRuleSettingMapper extends BaseMapper<UmsMemberRuleSetting> {
    long countByExample(UmsMemberRuleSettingExample example);

    int deleteByExample(UmsMemberRuleSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    List<UmsMemberRuleSetting> selectByExample(UmsMemberRuleSettingExample example);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByExample(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);
}