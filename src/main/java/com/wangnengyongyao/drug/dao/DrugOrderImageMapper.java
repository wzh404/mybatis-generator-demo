package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugOrderImage;

public interface DrugOrderImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrugOrderImage record);

    int insertSelective(DrugOrderImage record);

    DrugOrderImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrugOrderImage record);

    int updateByPrimaryKey(DrugOrderImage record);
}