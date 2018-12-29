package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugSeller;

public interface DrugSellerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugSeller record);

    int insertSelective(DrugSeller record);

    DrugSeller selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugSeller record);

    int updateByPrimaryKey(DrugSeller record);
}