package com.smart.common.handler;

import com.smart.common.exception.BusinessException;
import com.smart.common.result.BaseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalHandlerException {

    @ExceptionHandler
    public BaseResult<Object> handler(Exception exception){
        if (exception instanceof BusinessException){
            BusinessException e = (BusinessException) exception;
            return  BaseResult.error(e.getStatus(),e.getMessage());
        }
        return BaseResult.error();
    }
}
