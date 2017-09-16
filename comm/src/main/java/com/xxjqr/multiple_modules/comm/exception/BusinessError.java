package com.xxjqr.multiple_modules.comm.exception;

import lombok.Data;

/**
 * Created by xxjqr on 2017/8/31.
 */
public enum  BusinessError {
    参数错误(400,"参数错误")
    ;
    BusinessError(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
