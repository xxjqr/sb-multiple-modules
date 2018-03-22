package com.xxjqr.multiple_modules.app.hotel.service;

import com.xxjqr.multiple_modules.comm.exception.BusinessException;
import com.xxjqr.multiple_modules.core.hotel.po.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> listHotel() throws BusinessException;
}
