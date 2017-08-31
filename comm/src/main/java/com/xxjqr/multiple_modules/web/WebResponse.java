package com.xxjqr.multiple_modules.web;

import lombok.Data;

/**
 * Created by xxjqr on 2017/8/31.
 */
@Data
public class WebResponse {
    private Integer code;
    private String message;
    private Object data;
}
