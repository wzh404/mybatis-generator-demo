package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugCity;

public interface DrugCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugCity record);

    int insertSelective(DrugCity record);

    DrugCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugCity record);

    int updateByPrimaryKey(DrugCity record);
}