package com.kl.product.service.service.impl;

import com.kl.product.api.dversion.ProductApiVersion;
import com.kl.product.api.model.PmsSkuStock;
import com.kl.product.api.model.PmsSkuStockExample;
import com.kl.product.api.service.PmsSkuStockService;
import com.kl.product.service.data.PmsSkuStockMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品sku库存管理Service实现类
 * Created by macro on 2018/4/27.
 */
@DubboService(version = ProductApiVersion.VERSION_1, group = ProductApiVersion.GROUP_KL)
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;

    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockMapper.replaceList(skuStockList);
    }
}
