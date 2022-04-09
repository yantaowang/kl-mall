package com.kl.platform.manager.service;

import com.kl.product.api.dto.PmsProductParam;

public interface ProductService {

    int update(Long id, PmsProductParam productParam);
}
