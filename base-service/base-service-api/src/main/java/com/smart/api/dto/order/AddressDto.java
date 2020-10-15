package com.smart.api.dto.order;

import com.smart.api.dto.BaseDto;
import lombok.Data;

@Data
public class AddressDto extends BaseDto {

    private String detail;
    private String phone;
    private String username;


}
