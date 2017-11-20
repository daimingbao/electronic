package com.electronic.service;

import com.electronic.model.Goods;
import com.electronic.model.GoodsKey;

public interface GoodsService {
    int deleteByPrimaryKey(GoodsKey key);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(GoodsKey key);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}