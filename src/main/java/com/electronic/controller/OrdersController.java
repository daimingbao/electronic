package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;
import com.electronic.service.OrdersService;
@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;

    @RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(OrdersKey key) {
		return ordersService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
	public int insertSelective(Orders record) {
		return ordersService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey")
	public Orders selectByPrimaryKey(OrdersKey key) {
		return ordersService.selectByPrimaryKey(key);
	}

    @RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Orders record) {
		return ordersService.updateByPrimaryKeySelective(record);
	}

}
