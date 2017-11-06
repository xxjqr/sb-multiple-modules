package com.xxjqr.multiple_modules.core.prod.mapper;

import com.github.pagehelper.ISelect;
import com.xxjqr.multiple_modules.core.comm.mapper.MyMapper;
import com.xxjqr.multiple_modules.core.prod.po.Hotel;
import com.xxjqr.multiple_modules.core.prod.vo.ConHotelListVo;

import java.util.List;

/**
 * Created by xxjqr on 2017/9/16.
 */
public interface HotelMapper extends MyMapper<Hotel>{
    List<ConHotelListVo> getHotels();
}
