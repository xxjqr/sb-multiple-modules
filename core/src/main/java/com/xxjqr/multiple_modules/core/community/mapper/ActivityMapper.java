package com.xxjqr.multiple_modules.core.community.mapper;

import com.xxjqr.multiple_modules.core.comm.mapper.MyMapper;
import com.xxjqr.multiple_modules.core.community.po.ActCond;
import com.xxjqr.multiple_modules.core.community.po.ActServe;
import com.xxjqr.multiple_modules.core.community.po.Activity;

public interface ActivityMapper extends MyMapper<Activity>{
    ActServe listAct(ActCond param);
}
