package com.smart.alipay.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.smart.alipay.service.PavService;
import com.smart.common.result.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class PavServieImpl implements PavService {
    @Resource
    private DefaultAlipayClient defaultAlipayClient;



    @Override
    public BaseResult<String> pay(String orderNo, String total, String title) throws Exception {
        AlipayTradeAppPayResponse response = null;
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setSubject("smart-" + orderNo);
        model.setOutTradeNo(orderNo);
        // 设置总金额
        model.setTotalAmount(total);
        //支付超时时间
        model.setTimeoutExpress("30m");
        model.setProductCode("QUICK_MSECURITY_PAY");
        request.setBizModel(model);
        try {
            response = defaultAlipayClient.sdkExecute(request);
        } catch (AlipayApiException e) {
            throw   new  Exception("生成订单支付信息失败");
        }
        return BaseResult.success(response.getBody());

    }

    @Override
    public BaseResult<String> payWeb(String orderNo, String total, String title) {
        AlipayTradeAppPayResponse response = null;
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setSubject("smart-" + orderNo);
        model.setOutTradeNo(orderNo);
        // 设置总金额
        model.setTotalAmount(total);
        //支付超时时间
        model.setTimeoutExpress("30m");
        // .电脑网站支付产品alipay.trade.page.pay接口中，product_code为：FAST_INSTANT_TRADE_PAY
        //2.手机网站支付产品alipay.trade.wap.pay接口中，product_code为：QUICK_WAP_WAY
        //3.当面付条码支付产品alipay.trade.pay接口中，product_code为：FACE_TO_FACE_PAYMENT

        //4.APP支付产品alipay.trade.app.pay接口中，product_code为：QUICK_MSECURITY_PAY
        model.setProductCode("FAST_INSTANT_TRADE_PAY");
        request.setBizModel(model);
        try {
            response = defaultAlipayClient.pageExecute(request);
            log.info(response.getBody());
        } catch (AlipayApiException e) {

        }
        return BaseResult.success(response.getBody().replace('\"', '\''));

    }
}
