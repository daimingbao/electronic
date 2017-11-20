package com.electronic.dao;

import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;

public interface OrdersMapper {
    int deleteByPrimaryKey(OrdersKey key);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(OrdersKey key);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}