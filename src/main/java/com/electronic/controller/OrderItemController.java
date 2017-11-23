package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electronic.model.OrderItem;
import com.electronic.model.OrderItemKey;
import com.electronic.service.OrderItemService;
@Controller
@RequestMapping("/orderItem")
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
	public int deleteByPrimaryKey(OrderItemKey key) {
		return orderItemService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
    @ResponseBody
	public int insertSelective(OrderItem record) {
		return orderItemService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
	public OrderItem selectByPrimaryKey(OrderItemKey key) {
		return orderItemService.selectByPrimaryKey(key);
	}

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
	public int updateByPrimaryKeySelective(OrderItem record) {
		return orderItemService.updateByPrimaryKeySelective(record);
	}

}
