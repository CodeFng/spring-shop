package com.smart.api.service;

import com.smart.api.dto.order.OrderDto;

// 浏览商品 加入购物车 确认订单  生成订单
public interface OrderService {
    /**
     * 异步解耦 发送短信
     * 削峰
     * 生成订单
     * 收货地址
     * 手机号
     * 商品信息
     * 商品数量
     *
     * 如果秒杀  将上面的信息通过MQ发送给订单服务
     *
     */
    void createOrder(OrderDto order);

}
