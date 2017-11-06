package com.xxjqr.sbmultiplemodules.console.prod.service.impl;

import com.xxjqr.multiple_modules.comm.po.Pager;
import com.xxjqr.multiple_modules.core.comm.util.PagerUtil;
import com.xxjqr.multiple_modules.core.prod.mapper.HotelMapper;
import com.xxjqr.multiple_modules.core.prod.po.Hotel;
import com.xxjqr.sbmultiplemodules.console.prod.service.HotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Resource
    private HotelMapper hotelMapper;

    @Override
    public Pager getHotels() {
        return PagerUtil.query(()->hotelMapper.getHotels());
    }
}
