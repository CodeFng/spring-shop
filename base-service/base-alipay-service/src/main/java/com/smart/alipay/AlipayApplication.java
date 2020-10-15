package com.smart.alipay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlipayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlipayApplication.class,args);
    }
}
