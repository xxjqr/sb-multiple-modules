package com.xxjqr.multiple_modules.comm.exception;

import com.xxjqr.multiple_modules.comm.web.WebResponse;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xxjqr on 2017/8/31.
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    public WebResponse defaultErrorHandler(HttpServletRequest req, Exception e)  {
        WebResponse webResponse = new WebResponse();
        if (e instanceof BusinessException){
            webResponse.setCode(((BusinessException) e).getCode());
            webResponse.setMessage(((BusinessException) e).getMsg());
        }else if (e instanceof BindException){
            webResponse.setCode(200);
            webResponse.setMessage(((BindException) e).getBindingResult().getAllErrors().get(0).getDefaultMessage());
        }else {
            e.printStackTrace();
            webResponse.setCode(500);
            webResponse.setMessage("Internal Server Error");
        }
        return webResponse;
    }
}
