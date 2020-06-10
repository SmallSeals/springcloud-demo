package com.kb.demo.cloud.consul;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.kb.demo.cloud.consul.dao")
@EnableDiscoveryClient
public class PaymentConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulApplication.class,args);
    }
}
