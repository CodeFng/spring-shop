package com.smart.api.dto.order;

import com.smart.api.dto.BaseDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDto extends BaseDto {
    List<CartDto> carts;
    private String uid;
    private AddressDto addressDto;
    private String productNo;
    private BigDecimal totalPrice;

}
