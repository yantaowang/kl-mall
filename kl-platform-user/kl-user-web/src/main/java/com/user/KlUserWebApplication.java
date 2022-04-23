package com.user;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.kl.user.service.data"})
@EnableAsync
@Slf4j
public class KlUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlUserWebApplication.class, args);
        log.info("KlUserWebApplication 启动完成");
    }
}
