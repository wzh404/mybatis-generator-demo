package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugUserCart;

public interface DrugUserCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugUserCart record);

    int insertSelective(DrugUserCart record);

    DrugUserCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugUserCart record);

    int updateByPrimaryKey(DrugUserCart record);
}