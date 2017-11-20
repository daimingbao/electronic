package com.electronic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronic.dao.OrderItemMapper;
import com.electronic.model.OrderItem;
import com.electronic.model.OrderItemKey;
import com.electronic.service.OrderItemService;
@Service
public class OrderItemServiceImpl implements OrderItemService {
	
	@Autowired
	private OrderItemMapper orderItemMapper;

	@Override
	public int deleteByPrimaryKey(OrderItemKey key) {
		return orderItemMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(OrderItem record) {
		return orderItemMapper.insert(record);
	}

	@Override
	public int insertSelective(OrderItem record) {
		return orderItemMapper.insertSelective(record);
	}

	@Override
	public OrderItem selectByPrimaryKey(OrderItemKey key) {
		return orderItemMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderItem record) {
		return orderItemMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderItem record) {
		return orderItemMapper.updateByPrimaryKey(record);
	}

}
