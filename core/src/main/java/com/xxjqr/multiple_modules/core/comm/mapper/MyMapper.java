package com.xxjqr.multiple_modules.core.comm.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by xxjqr on 2017/8/29.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
