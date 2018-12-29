package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugUser;

public interface DrugUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugUser record);

    int insertSelective(DrugUser record);

    DrugUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugUser record);

    int updateByPrimaryKey(DrugUser record);
}