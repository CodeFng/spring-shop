package com.smart.alipay.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PayInfo implements Serializable {
    /**
     * 订单号
     */
    private String  orderNo;
    /**
     * 总金额
     */
    private String total;
    /**
     * 标题
     */
    private String  subject;
}
