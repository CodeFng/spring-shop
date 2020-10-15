package com.smart.pay.controller;

import com.smart.pay.dto.PayInfo;
import com.smart.pay.service.CommonPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/pay")
public class PayController {
    @Resource
    CommonPayService payService;

    @GetMapping("/")
    public void pay(int payType, PayInfo payInfo){
        payService.pay(payType,payInfo);
    }

}
