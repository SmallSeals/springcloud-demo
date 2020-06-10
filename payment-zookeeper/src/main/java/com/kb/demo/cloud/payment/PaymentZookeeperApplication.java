package com.kb.demo.cloud.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(value = {"com.kb.demo.cloud.payment.dao"})
@EnableDiscoveryClient
public class PaymentZookeeperApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperApplication.class,args);
    }
}
