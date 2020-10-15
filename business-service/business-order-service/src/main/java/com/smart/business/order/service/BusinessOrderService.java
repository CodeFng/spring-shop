package com.smart.business.order.service;

import com.smart.api.dto.order.CartDto;
import com.smart.api.dto.order.OrderDto;
import com.smart.api.dto.store.StoreDto;
import com.smart.api.service.OrderService;
import com.smart.api.service.StorageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 加入购物车---》 结算---》 确认购买---》 生成订单---》 确认支付（支付方式）
 *
 *
 */
@Service
public class BusinessOrderService {
    @Reference(check = false)
    OrderService orderService;

    @Reference(check = false)
    StorageService storageService;

    public OrderDto createOrder(OrderDto order){
        //保存订单
        orderService.createOrder(order);
        //减少库存
        List<CartDto> carts = order.getCarts();
        List<StoreDto> stores = new ArrayList<>();
        carts.forEach((cart)->{
            StoreDto store = new StoreDto();
            store.setProductId(cart.getProductId());
            store.setNum(cart.getNum());
            stores.add(store);
        });

        storageService.decrease(stores);

        return null;


    }
}
