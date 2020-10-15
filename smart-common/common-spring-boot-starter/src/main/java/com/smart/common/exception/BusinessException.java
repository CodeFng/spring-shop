package com.smart.common.exception;
import com.smart.common.result.ResultCodeEnum;

public class BusinessException extends RuntimeException{
    private int status;

    public BusinessException(int status,String message) {
        super(message);
        this.status = status;
    }

    public BusinessException(ResultCodeEnum codeEnum) {
        super(codeEnum.getRetMsg());
        this.status = codeEnum.getRetCode();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
