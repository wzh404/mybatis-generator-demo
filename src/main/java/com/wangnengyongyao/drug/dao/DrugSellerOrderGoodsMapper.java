package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugSellerOrderGoods;

public interface DrugSellerOrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugSellerOrderGoods record);

    int insertSelective(DrugSellerOrderGoods record);

    DrugSellerOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugSellerOrderGoods record);

    int updateByPrimaryKey(DrugSellerOrderGoods record);
}