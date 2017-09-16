package com.xxjqr.multiple_modules.core.prod.po;


import com.xxjqr.multiple_modules.comm.Annotation.MoneyAnno;
import com.xxjqr.multiple_modules.comm.util.MoneyUtil;

import javax.persistence.*;

/**
 * Created by xxjqr on 2017/9/16.
 */
@Table(name = "t_serve")
public class ProdServe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "market_price")
    @MoneyAnno(moneyType = MoneyUtil.fStr,offset = "2")
    private Integer marketPrice;

    @MoneyAnno(moneyType = MoneyUtil.yStr,offset = "2")
    @Column(name = "cost_price")
    private Integer costPrice;

    @MoneyAnno(moneyType = MoneyUtil.jStr,offset = "2")
    @Column(name = "prefer_price")
    private Integer preferPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getPreferPrice() {
        return preferPrice;
    }

    public void setPreferPrice(Integer preferPrice) {
        this.preferPrice = preferPrice;
    }
}
