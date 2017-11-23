package com.electronic.service;

import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.dto.res.QryOrderDetailRes;
import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;

public interface OrdersService {
    int deleteByPrimaryKey(OrdersKey key);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(OrdersKey key);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    QryOrderDetailRes qryOrderDetail(QryOrderDetailReq req);

}