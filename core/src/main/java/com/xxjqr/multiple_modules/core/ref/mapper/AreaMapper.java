package com.xxjqr.multiple_modules.core.ref.mapper;

import com.xxjqr.multiple_modules.core.ref.po.Area;
import com.xxjqr.multiple_modules.core.comm.mapper.MyMapper;

import java.util.List;

/**
 * Created by xxjqr on 2017/9/16.
 */
public interface AreaMapper extends MyMapper<Area> {
    List<Area> getAreas();
}
