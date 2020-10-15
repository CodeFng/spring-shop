package com.smart.pay.feign;

import com.smart.common.result.BaseResult;
import com.smart.pay.dto.PayInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ali-pay-service-zjf",path = "ali")
public interface AliPayService {
    @GetMapping("pay")
    BaseResult<String> alipay(PayInfo payInfo);
}
