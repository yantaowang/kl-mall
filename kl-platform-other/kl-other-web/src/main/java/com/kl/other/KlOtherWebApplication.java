package com.kl.other;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.kl.other.service.data"})
@EnableAsync
@Slf4j
public class KlOtherWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlOtherWebApplication.class, args);
        log.info("KlOtherWebApplication 启动完成");
    }
}
