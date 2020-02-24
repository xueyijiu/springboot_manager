package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.Comment;
import tk.mapper.MyMapper;

public interface CommentMapper  {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}