package com.smart.pay.service;

import com.smart.pay.dto.PayInfo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 13644
 */
@FeignClient
public interface CommonPayService {
    void pay (int payType, PayInfo payInfo);
}
