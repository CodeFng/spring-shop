package com.smart.business.order.controller;

import com.smart.business.order.service.BusinessOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 13644
 */
@RestController
@RequestMapping("/order")
public class BusinessController {

    @Resource
    BusinessOrderService service;

    @GetMapping("/")
    public String order(){

        service.createOrder(null);
        return "success";
    }


}
