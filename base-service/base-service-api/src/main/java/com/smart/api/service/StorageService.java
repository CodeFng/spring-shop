package com.smart.api.service;

import com.smart.api.dto.BaseDto;
import com.smart.api.dto.order.CartDto;
import com.smart.api.dto.store.StoreDto;

import java.util.List;

public interface StorageService {
    void decrease(List<StoreDto> stores);
    List<CartDto> query(List<StoreDto> store);
    int update(List<StoreDto> store);
}
