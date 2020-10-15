package com.smart.alipay.config;

import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

//实例化客户端
@Configuration
public class AlipayConfig {
    @Resource
    private  AliapyProperties  aliapyProperties;
    @Bean
    public DefaultAlipayClient  alipayClient(){
       return new DefaultAlipayClient(
                aliapyProperties.getPayGateway(),
                aliapyProperties.getAppId(),
                aliapyProperties.getPrivateKey(),
                aliapyProperties.getFormat(),
                aliapyProperties.getCharset(),
                aliapyProperties.getAlipayPublicKey(),
                aliapyProperties.getSignType() );
    }



}
