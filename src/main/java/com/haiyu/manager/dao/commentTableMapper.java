package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.commentTable;
import tk.mapper.MyMapper;

public interface commentTableMapper extends MyMapper<commentTable> {
    int deleteByPrimaryKey(Long id);

    int insert(commentTable record);

    int insertSelective(commentTable record);

    commentTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(commentTable record);

    int updateByPrimaryKey(commentTable record);
}