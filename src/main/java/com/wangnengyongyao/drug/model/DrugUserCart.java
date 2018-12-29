package com.wangnengyongyao.drug.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DrugUserCart implements Serializable {
    private Integer id;

    private Long userId;

    private String goodsName;

    private BigDecimal goodsPrice;

    private String goodsSpecifications;

    private Integer goodsNumber;

    private String goodsVendor;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsSpecifications() {
        return goodsSpecifications;
    }

    public void setGoodsSpecifications(String goodsSpecifications) {
        this.goodsSpecifications = goodsSpecifications == null ? null : goodsSpecifications.trim();
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsVendor() {
        return goodsVendor;
    }

    public void setGoodsVendor(String goodsVendor) {
        this.goodsVendor = goodsVendor == null ? null : goodsVendor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}