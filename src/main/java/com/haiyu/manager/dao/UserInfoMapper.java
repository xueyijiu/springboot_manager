package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.Comment;
import com.haiyu.manager.pojo.UserInfo;
import tk.mapper.MyMapper;

public interface UserInfoMapper extends MyMapper<UserInfo> {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}