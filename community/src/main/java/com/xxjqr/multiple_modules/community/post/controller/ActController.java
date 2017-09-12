package com.xxjqr.multiple_modules.community.post.controller;

import com.xxjqr.multiple_modules.community.post.service.ActivityService;
import com.xxjqr.multiple_modules.core.community.po.ActCond;
import com.xxjqr.multiple_modules.web.WebResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("rest/act")
public class ActController {
    @Resource
    private ActivityService activityService;

    @RequestMapping("/list")
    public WebResponse listAct(ActCond param){
        return new WebResponse(activityService.listAct(param));
    }

}
