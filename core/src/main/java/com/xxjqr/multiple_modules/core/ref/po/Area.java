package com.xxjqr.multiple_modules.core.ref.po;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "t_area")
public class Area{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "p_area_id")
    private Integer pAreaId;
    @Column(name = "area_name")
    private String areaName;
    private Integer level;
    private BigDecimal lng;
    private BigDecimal lat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpAreaId() {
        return pAreaId;
    }

    public void setpAreaId(Integer pAreaId) {
        this.pAreaId = pAreaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
}
