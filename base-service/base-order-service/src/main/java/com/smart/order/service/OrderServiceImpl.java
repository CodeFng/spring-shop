package com.smart.order.service;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.smart.api.dto.order.CartDto;
import com.smart.api.dto.order.OrderDto;
import com.smart.api.dto.store.StoreDto;
import com.smart.api.service.OrderService;
import com.smart.api.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @author 13644
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Reference
    StorageService storageService;

    @Override
    public void createOrder(OrderDto order) {
        /**
         *  order 表
         *  order-item 表
         *
         *  订单号生成  雪花算法
         */
        //计算订单总价
        List<CartDto> carts = order.getCarts();
        List<StoreDto> stores = new ArrayList<>();
        //订单总价格
        BigDecimal totalPrice = order.getTotalPrice();
        carts.forEach((cart)->{
            StoreDto store = new StoreDto();
            int productId = cart.getProductId();
            int num = cart.getNum();
            store.setProductId(productId);
            store.setNum(num);
            stores.add(store);
        });
        //
        List<CartDto> store = storageService.query(stores);
        long id = IdWorker.getId();



        log.info("调用订单服务");



    }
}
