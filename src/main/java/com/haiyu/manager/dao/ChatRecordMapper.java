package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.ChatRecord;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;


public interface ChatRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    ChatRecord selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);
}