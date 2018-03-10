package com.xxjqr.sbmultiplemodules.console.ref.controller;

import com.xxjqr.multiple_modules.core.comm.web.WebResponse;
import com.xxjqr.sbmultiplemodules.console.ref.service.AreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("rest")
public class AreaController {
    @Resource
    private AreaService areaService;

    @RequestMapping("areas")
    public WebResponse getAreas(){
//        return new WebResponse(hotelService.getHotels());
        return null;
    }
}
