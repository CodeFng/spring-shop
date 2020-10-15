package com.smart.pay.service.Impl;

import com.smart.pay.dto.PayInfo;
import com.smart.pay.feign.AliPayService;
import com.smart.pay.service.CommonPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommonPayServiceImpl implements CommonPayService {

    @Resource
    AliPayService aliPayService;

    @Override
    public void pay(int payType, PayInfo payInfo) {

        if (payType==1){
            aliPayService.alipay(payInfo);
        }else if (payType==2){
            //微信
        }else{
            //银联
        }

    }
}
