package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.Comment;
import com.haiyu.manager.pojo.FriendRequest;
import tk.mapper.MyMapper;

public interface FriendRequestMapper  {
    int deleteByPrimaryKey(String id);

    int insert(FriendRequest record);

    int insertSelective(FriendRequest record);

    FriendRequest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FriendRequest record);

    int updateByPrimaryKey(FriendRequest record);
}