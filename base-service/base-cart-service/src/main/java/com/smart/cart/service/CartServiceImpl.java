package com.smart.cart.service;

import com.smart.api.dto.order.CartDto;
import com.smart.api.service.CartService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public int delete(List<CartDto> catrs) {



        return 0;
    }
}
