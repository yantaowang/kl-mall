package com.kl.order.service.service;

import com.kl.order.api.model.OmsCompanyAddress;
import com.kl.order.api.model.OmsCompanyAddressExample;
import com.kl.order.api.service.OmsCompanyAddressService;
import com.kl.order.service.data.OmsCompanyAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by macro on 2018/10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
