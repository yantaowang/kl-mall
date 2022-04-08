package com.kl.user.service.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kl.user.api.model.UmsIntegrationConsumeSetting;
import com.kl.user.api.model.UmsIntegrationConsumeSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsIntegrationConsumeSettingMapper extends BaseMapper<UmsIntegrationConsumeSetting> {
    long countByExample(UmsIntegrationConsumeSettingExample example);

    int deleteByExample(UmsIntegrationConsumeSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationConsumeSetting record);

    int insertSelective(UmsIntegrationConsumeSetting record);

    List<UmsIntegrationConsumeSetting> selectByExample(UmsIntegrationConsumeSettingExample example);

    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    int updateByExample(@Param("record") UmsIntegrationConsumeSetting record, @Param("example") UmsIntegrationConsumeSettingExample example);

    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}