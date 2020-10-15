package com.smart.api.dto.store;

import com.smart.api.dto.BaseDto;
import lombok.Data;

/**
 * @author 13644
 */
@Data
public class StoreDto extends BaseDto {
    private int productId;
    private int currentQuantity;
    private int num;
}
