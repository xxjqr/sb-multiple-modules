package com.xxjqr.multiple_modules.exception;

import lombok.Data;

/**
 * Created by xxjqr on 2017/8/31.
 */
@Data
public class BusinessException extends Exception{
    private static final long serialVersionUID = 1L;

    private Integer code;

    private String msg;

    public BusinessException() {
        super();
    }

    public BusinessException(BusinessError businessError){
        this.code=businessError.getCode();
        this.msg=businessError.getMsg();
    }

    BusinessException(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
}