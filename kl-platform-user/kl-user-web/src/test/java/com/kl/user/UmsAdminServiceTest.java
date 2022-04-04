package com.kl.user;

import com.alibaba.fastjson.JSON;
import com.kl.KlUserWebApplication;
import com.kl.user.api.model.UmsAdmin;
import com.kl.user.api.service.UmsAdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest(classes = KlUserWebApplication.class)
public class UmsAdminServiceTest {

    @Resource
    private UmsAdminService umsAdminService;

    @Test
    public void getAdminByUsernameTest() {
        final UmsAdmin ums = umsAdminService.getAdminByUsername("adnb");
        System.out.println(JSON.toJSONString(ums));
    }
}
