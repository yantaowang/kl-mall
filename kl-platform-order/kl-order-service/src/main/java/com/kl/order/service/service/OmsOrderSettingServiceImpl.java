package com.kl.order.service.service;

import com.kl.order.api.dversion.OrderApiVersion;
import com.kl.order.api.service.OmsOrderSettingService;
import com.kl.order.service.data.OmsOrderSettingMapper;
import com.kl.order.api.model.OmsOrderSetting;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单设置管理Service实现类
 * Created by macro on 2018/10/16.
 */
@DubboService(version = OrderApiVersion.VERSION_1, group = OrderApiVersion.GROUP_KL)
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
