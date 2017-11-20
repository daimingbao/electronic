package com.electronic.dao;

import com.electronic.model.Goods;
import com.electronic.model.GoodsKey;

public interface GoodsMapper {
    int deleteByPrimaryKey(GoodsKey key);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(GoodsKey key);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}