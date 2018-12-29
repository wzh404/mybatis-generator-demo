package com.wangnengyongyao.drug.dao;

import com.wangnengyongyao.drug.model.DrugUserWeixin;

public interface DrugUserWeixinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugUserWeixin record);

    int insertSelective(DrugUserWeixin record);

    DrugUserWeixin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DrugUserWeixin record);

    int updateByPrimaryKey(DrugUserWeixin record);
}