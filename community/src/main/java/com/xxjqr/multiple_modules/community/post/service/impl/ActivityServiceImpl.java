package com.xxjqr.multiple_modules.community.post.service.impl;

import com.xxjqr.multiple_modules.community.post.service.ActivityService;
import com.xxjqr.multiple_modules.core.community.mapper.ActivityMapper;
import com.xxjqr.multiple_modules.core.community.po.ActCond;
import com.xxjqr.multiple_modules.core.community.po.ActServe;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xxjqr on 2017/9/12.
 */
@Service
public class ActivityServiceImpl implements ActivityService{

    @Resource
    private ActivityMapper activityMapper;

    @Override
    public ActServe listAct(ActCond param) {
        return activityMapper.listAct(param);
    }
}
