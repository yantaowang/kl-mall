package com.kl.user.service.service.impl;

import com.kl.redis.starter.service.RedisCommand;
import com.kl.user.api.dversion.UserApiVersion;
import com.kl.user.api.model.UmsAdmin;
import com.kl.user.api.service.UmsAdminCacheService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * UmsAdminCacheService实现类
 * Created by macro on 2020/3/13.
 */
@DubboService(version = UserApiVersion.VERSION_1, group = UserApiVersion.GROUP_KL)
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {
    @Autowired
    private RedisCommand redisCommand;
    @Value("${redis.database:0}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common:5}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.admin:admin}")
    private String REDIS_KEY_ADMIN;

    @Override
    public void delAdmin(Long adminId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + adminId;
        redisCommand.del(key);
    }

    @Override
    public UmsAdmin getAdmin(Long adminId) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + adminId;
        return (UmsAdmin) redisCommand.get(key);
    }

    @Override
    public void setAdmin(UmsAdmin admin) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + admin.getId();
        redisCommand.set(key, admin, REDIS_EXPIRE, TimeUnit.SECONDS);
    }
}
