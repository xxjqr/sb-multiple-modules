package com.xxjqr.multiple_modules.comm.web;

import lombok.Data;

/**
 * Created by xxjqr on 2017/8/31.
 */
@Data
public class WebResponse {
    private Integer code;
    private String message;
    private Object data;

    public WebResponse(){};

    public WebResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }

    public WebResponse(Object data){
        this.data = data;
        this.code = 200;
    }

    public WebResponse(Integer code,String message,Object data){
        this(code,message);
        this.data=data;
    }
}
