package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugSellerOrder;

public interface DrugSellerOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugSellerOrder record);

    int insertSelective(DrugSellerOrder record);

    DrugSellerOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugSellerOrder record);

    int updateByPrimaryKey(DrugSellerOrder record);
}