package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugStore;

public interface DrugStoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugStore record);

    int insertSelective(DrugStore record);

    DrugStore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugStore record);

    int updateByPrimaryKeyWithBLOBs(DrugStore record);

    int updateByPrimaryKey(DrugStore record);
}