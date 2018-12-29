package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugOrderGoods;

public interface DrugOrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugOrderGoods record);

    int insertSelective(DrugOrderGoods record);

    DrugOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugOrderGoods record);

    int updateByPrimaryKey(DrugOrderGoods record);
}