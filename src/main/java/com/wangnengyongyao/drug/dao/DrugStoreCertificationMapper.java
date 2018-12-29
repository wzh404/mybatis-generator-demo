package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugStoreCertification;

public interface DrugStoreCertificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugStoreCertification record);

    int insertSelective(DrugStoreCertification record);

    DrugStoreCertification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugStoreCertification record);

    int updateByPrimaryKey(DrugStoreCertification record);
}