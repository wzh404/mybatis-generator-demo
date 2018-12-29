package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.Drug;

public interface DrugMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKeyWithBLOBs(Drug record);

    int updateByPrimaryKey(Drug record);
}