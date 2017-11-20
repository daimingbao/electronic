package com.electronic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronic.dao.GoodsMapper;
import com.electronic.model.Goods;
import com.electronic.model.GoodsKey;
import com.electronic.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public int deleteByPrimaryKey(GoodsKey key) {
		return goodsMapper.deleteByPrimaryKey(key);
	}

	@Override
	public int insert(Goods record) {
		return goodsMapper.insert(record);
	}

	@Override
	public int insertSelective(Goods record) {
		return goodsMapper.insertSelective(record);
	}

	@Override
	public Goods selectByPrimaryKey(GoodsKey key) {
		return goodsMapper.selectByPrimaryKey(key);
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		return goodsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Goods record) {
		return goodsMapper.updateByPrimaryKey(record);
	}

}
