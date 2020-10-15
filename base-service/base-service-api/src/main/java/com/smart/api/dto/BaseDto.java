package com.smart.api.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class BaseDto implements Serializable {
    private  int productId;
    private int  num;

}
