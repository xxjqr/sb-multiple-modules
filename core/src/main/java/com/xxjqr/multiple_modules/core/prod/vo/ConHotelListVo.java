package com.xxjqr.multiple_modules.core.prod.vo;

import com.xxjqr.multiple_modules.comm.annotation.StrLengthAnno;

import java.math.BigDecimal;

public class ConHotelListVo {
    private Integer id;
    private String city;
    private String name;
    private String address;
    private Integer price;
    private Double grade;
    private BigDecimal lng;
    private BigDecimal lat;
    @StrLengthAnno(count = 10)
    private String contact;
    @StrLengthAnno(count = 10)
    private String basicInfo;
    @StrLengthAnno(count = 10)
    private String mainFacilities;
    @StrLengthAnno(count = 10)
    private String hotelServes;
    @StrLengthAnno(count = 10)
    private String hotelFacilities;
    @StrLengthAnno(count = 10)
    private String roomFacilities;
    @StrLengthAnno(count = 10)
    private String imgs;
    @StrLengthAnno(count = 10)
    private String introduce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
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
}
