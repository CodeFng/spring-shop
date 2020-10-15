package com.smart.business.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 13644
 */
@SpringBootApplication
@EnableDubbo
@EnableDiscoveryClient
public class BusinessOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessOrderApplication.class,args);
    }

}
