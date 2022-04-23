package com.kl.product;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.kl.product.service.data"})
@EnableAsync
@Slf4j
public class KlProductWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlProductWebApplication.class, args);
        log.info("KlProductWebApplication 启动完成");
    }
}
