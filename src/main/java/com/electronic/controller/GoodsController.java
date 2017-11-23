package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electronic.model.Goods;
import com.electronic.model.GoodsKey;
import com.electronic.service.GoodsService;
@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;

	@ResponseBody
    @RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(GoodsKey key) {
		return goodsService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
    @ResponseBody
	public int insertSelective(Goods record) {
		return goodsService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey.json")
    @ResponseBody
	public Goods selectByPrimaryKey(GoodsKey key) {
		return goodsService.selectByPrimaryKey(key);
	}

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
	public int updateByPrimaryKeySelective(Goods record) {
		return goodsService.updateByPrimaryKeySelective(record);
	}

}
