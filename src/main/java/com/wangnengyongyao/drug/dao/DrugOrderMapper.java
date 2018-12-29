package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugOrder;

public interface DrugOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugOrder record);

    int insertSelective(DrugOrder record);

    DrugOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugOrder record);

    int updateByPrimaryKey(DrugOrder record);
}