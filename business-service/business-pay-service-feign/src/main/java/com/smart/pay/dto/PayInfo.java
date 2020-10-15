package com.smart.pay.dto;

import lombok.Data;

@Data
public class PayInfo {

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
