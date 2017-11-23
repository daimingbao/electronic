package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electronic.model.UserInfo;
import com.electronic.model.UserInfoKey;
import com.electronic.service.UserInfoService;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
	public int deleteByPrimaryKey(UserInfoKey key) {
		return userInfoService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
    @ResponseBody
	public int insertSelective(UserInfo record) {
		return userInfoService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
	public UserInfo selectByPrimaryKey(UserInfoKey key) {
		return userInfoService.selectByPrimaryKey(key);
	}

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
	public int updateByPrimaryKeySelective(UserInfo record) {
		return userInfoService.updateByPrimaryKeySelective(record);
	}

}
