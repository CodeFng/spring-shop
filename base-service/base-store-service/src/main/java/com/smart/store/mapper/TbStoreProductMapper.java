package com.smart.store.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smart.api.dto.order.CartDto;
import com.smart.api.dto.store.StoreDto;
import com.smart.store.entity.TbStoreProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStoreProductMapper extends BaseMapper<TbStoreProduct> {
    List<CartDto> query(@Param("store") List<StoreDto> store);
    int updateQuantityByProductId(@Param("store") List<StoreDto> store);



}