package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.postsTable;
import tk.mapper.MyMapper;

public interface postsTableMapper extends MyMapper<postsTable> {
    int deleteByPrimaryKey(Long id);

    int insert(postsTable record);

    int insertSelective(postsTable record);

    postsTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(postsTable record);

    int updateByPrimaryKey(postsTable record);
}