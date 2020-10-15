package com.smart.api.dto.order;

import com.smart.api.dto.BaseDto;
import lombok.Data;
import java.math.BigDecimal;

/**
 * @author 13644
 */
@Data
public class CartDto extends BaseDto {
    private int cartId;
    private int productId;
    private String pic;
    private String title;
    private BigDecimal price;
    private int num;

}
