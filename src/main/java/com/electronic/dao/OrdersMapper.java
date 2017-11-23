package com.electronic.dao;

import java.util.List;

import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.model.OrderDetail;
import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;

public interface OrdersMapper {
    int deleteByPrimaryKey(OrdersKey key);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(OrdersKey key);
    
    List<OrderDetail> qryOrderDetail(QryOrderDetailReq req);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}