package com.smart.store.service;

import com.smart.api.dto.BaseDto;
import com.smart.api.dto.order.CartDto;
import com.smart.api.dto.store.StoreDto;
import com.smart.api.service.StorageService;
import com.smart.store.mapper.TbStoreProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.StoreManager;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 13644
 */
@Service
@Slf4j
public class StoreServiceImpl implements StorageService {
    @Resource
    TbStoreProductMapper StoreProductMapper;


    @Override
    public void decrease(List<StoreDto> stores) {
        log.info("减库存");

    }

    @Override
    public List<CartDto> query(List<StoreDto> store) {




        return null;
    }

    @Override
    public int update(List<StoreDto> store) {
        return 0;
    }
}
