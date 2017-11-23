package com.electronic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronic.dao.OrdersMapper;
import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.dto.res.QryOrderDetailRes;
import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;
import com.electronic.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;

	@Override
	public int deleteByPrimaryKey(OrdersKey key) {
		return ordersMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(Orders record) {
		return ordersMapper.insert(record);
	}

	@Override
	public int insertSelective(Orders record) {
		return ordersMapper.insertSelective(record);
	}

	@Override
	public Orders selectByPrimaryKey(OrdersKey key) {
		return ordersMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(Orders record) {
		return ordersMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Orders record) {
		return ordersMapper.updateByPrimaryKey(record);
	}

    @Override
    public QryOrderDetailRes qryOrderDetail(QryOrderDetailReq req) {
        QryOrderDetailRes res = new QryOrderDetailRes();
        res.setData(ordersMapper.qryOrderDetail(req));
        return res;
    }

}
