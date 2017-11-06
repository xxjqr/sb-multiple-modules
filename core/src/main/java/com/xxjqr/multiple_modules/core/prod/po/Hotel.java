package com.xxjqr.multiple_modules.core.prod.po;

import com.xxjqr.multiple_modules.comm.annotation.StrLengthAnno;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "t_hotel")
public class Hotel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="area_id")
    private Integer areaId;
    private String address;
    private Integer price;
    private Double grade;
    private BigDecimal lng;
    private BigDecimal lat;
    private String contact;
    @Column(name = "basic_info")
    private String basicInfo;
    @Column(name = "main_facilities")
    private String mainFacilities;
    @Column(name = "hotel_serves")
    private String hotelServes;
    @Column(name = "hotel_facilities")
    private String hotelFacilities;
    @Column(name = "room_facilities")
    private String roomFacilities;
    private String imgs;
    private String introduce;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMainFacilities() {
        return mainFacilities;
    }

    public void setMainFacilities(String mainFacilities) {
        this.mainFacilities = mainFacilities;
    }

    public String getHotelServes() {
        return hotelServes;
    }

    public void setHotelServes(String hotelServes) {
        this.hotelServes = hotelServes;
    }

    public String getHotelFacilities() {
        return hotelFacilities;
    }

    public void setHotelFacilities(String hotelFacilities) {
        this.hotelFacilities = hotelFacilities;
    }

    public String getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(String roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }
}
