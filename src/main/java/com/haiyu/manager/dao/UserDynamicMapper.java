package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.Comment;
import com.haiyu.manager.pojo.UserDynamic;
import tk.mapper.MyMapper;

public interface UserDynamicMapper  {
    int deleteByPrimaryKey(String dynamicId);

    int insert(UserDynamic record);

    int insertSelective(UserDynamic record);

    UserDynamic selectByPrimaryKey(String dynamicId);

    int updateByPrimaryKeySelective(UserDynamic record);

    int updateByPrimaryKey(UserDynamic record);
}