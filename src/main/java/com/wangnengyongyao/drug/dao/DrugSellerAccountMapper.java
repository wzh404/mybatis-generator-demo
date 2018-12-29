package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugSellerAccount;

public interface DrugSellerAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugSellerAccount record);

    int insertSelective(DrugSellerAccount record);

    DrugSellerAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugSellerAccount record);

    int updateByPrimaryKey(DrugSellerAccount record);
}