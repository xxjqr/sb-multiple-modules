package com.xxjqr.multiple_modules.community.post.service;

import com.xxjqr.multiple_modules.core.community.po.ActCond;
import com.xxjqr.multiple_modules.core.community.po.ActServe;

/**
 * Created by xxjqr on 2017/9/12.
 */
public interface ActivityService {
    ActServe listAct(ActCond param);
}
