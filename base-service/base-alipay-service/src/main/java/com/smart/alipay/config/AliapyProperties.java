package com.smart.alipay.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
@ConfigurationProperties(prefix = "pay.ali")
public class AliapyProperties {
    private String appId;
    private String payGateway;
    private String privateKey;
    private String format;
    private String charset;
    private String alipayPublicKey;
    private String signType;

}
