package com.xxjqr.multiple_modules.app.prod.controller;

import com.xxjqr.multiple_modules.app.prod.service.ProdServeService;
import com.xxjqr.multiple_modules.web.WebResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xxjqr on 2017/9/16.
 */
@RestController
@RequestMapping("rest/prodServe")
public class ProdServeController {
    @Resource
    private ProdServeService prodServeService;

    @RequestMapping("/list")
    public WebResponse listProdServe(){
        return new WebResponse(prodServeService.listProdServe());
    }
}
