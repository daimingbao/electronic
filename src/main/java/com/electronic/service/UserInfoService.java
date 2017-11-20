package com.electronic.service;

import com.electronic.model.UserInfo;
import com.electronic.model.UserInfoKey;

public interface UserInfoService {
    int deleteByPrimaryKey(UserInfoKey key);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(UserInfoKey key);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}