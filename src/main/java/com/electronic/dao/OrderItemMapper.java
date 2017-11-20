package com.electronic.dao;

import com.electronic.model.OrderItem;
import com.electronic.model.OrderItemKey;

public interface OrderItemMapper {
    int deleteByPrimaryKey(OrderItemKey key);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(OrderItemKey key);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}