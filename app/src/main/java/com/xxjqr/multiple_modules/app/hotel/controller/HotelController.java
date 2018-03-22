package com.xxjqr.multiple_modules.app.hotel.controller;

import com.xxjqr.multiple_modules.app.hotel.service.HotelService;
import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.comm.web.WebResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/rest/hotel")
public class HotelController {

    @Resource
    private HotelService hotelService;

    @GetMapping(value = "list")
    public WebResponse listHotel() throws BusinessException {
        return new WebResponse(hotelService.listHotel());
    }
}
