package com.kl.other.service.service;

import com.kl.other.api.dversion.OtherApiVersion;
import com.kl.other.service.data.CmsPrefrenceAreaMapper;
import com.kl.other.api.model.CmsPrefrenceArea;
import com.kl.other.api.model.CmsPrefrenceAreaExample;
import com.kl.other.api.service.CmsPrefrenceAreaService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 * Created by macro on 2018/6/1.
 */
@DubboService(version = OtherApiVersion.VERSION_1, group = OtherApiVersion.GROUP_KL)
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
