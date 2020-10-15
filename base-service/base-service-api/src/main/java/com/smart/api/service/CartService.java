package com.smart.api.service;

import com.smart.api.dto.order.CartDto;

import java.util.List;

public interface CartService {

    int delete (List<CartDto> catrs);

}
