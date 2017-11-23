package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.dto.res.QryOrderDetailRes;
import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;
import com.electronic.service.OrdersService;
@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
	public int deleteByPrimaryKey(OrdersKey key) {
		return ordersService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
    @ResponseBody
	public int insertSelective(Orders record) {
		return ordersService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
	public Orders selectByPrimaryKey(OrdersKey key) {
		return ordersService.selectByPrimaryKey(key);
	}
    
    @RequestMapping("/qryOrderDetail")
    @ResponseBody
    public QryOrderDetailRes qryOrderDetail(QryOrderDetailReq req) {
        return ordersService.qryOrderDetail(req);
    }

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
	public int updateByPrimaryKeySelective(Orders record) {
		return ordersService.updateByPrimaryKeySelective(record);
	}

}
