package com.xxjqr.multiple_modules.core.community.po;

import java.util.Date;
import java.util.List;

public class ActivityServe {
    private Integer serviceId;
    private Integer serviceNum;
    private Date serviceTime;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(Integer serviceNum) {
        this.serviceNum = serviceNum;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }
}
