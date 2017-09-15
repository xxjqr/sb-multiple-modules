package com.xxjqr.multiple_modules.core.community.po;

import com.xxjqr.multiple_modules.core.comm.Annotation.TestAnnotation;

import java.util.Date;
import java.util.List;

public class ActServe {
    private Integer id;
    @TestAnnotation(addValue = "aaa")
    private String title;
    List<ActivityServe> actServeList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ActivityServe> getActServeList() {
        return actServeList;
    }

    public void setActServeList(List<ActivityServe> actServeList) {
        this.actServeList = actServeList;
    }
}
