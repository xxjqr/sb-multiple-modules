package com.xxjqr.sbmultiplemodules.console.prod.controller;

import com.xxjqr.multiple_modules.web.WebResponse;
import com.xxjqr.sbmultiplemodules.console.prod.service.HotelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("rest")
public class HotelController {

    @Resource
    private HotelService hotelService;

    @RequestMapping("hotels")
    public WebResponse getHotels(){
        return new WebResponse(hotelService.getHotels());
    }
}
