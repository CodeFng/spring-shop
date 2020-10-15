package com.smart.alipay.service;

import com.smart.common.result.BaseResult;

public interface PavService {
    BaseResult<String> pay(String orderNo, String total,String title) throws Exception;
    BaseResult<String> payWeb(String orderNo, String total, String title);

}
