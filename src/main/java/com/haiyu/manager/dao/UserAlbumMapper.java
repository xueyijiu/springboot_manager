package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.Comment;
import com.haiyu.manager.pojo.UserAlbum;
import tk.mapper.MyMapper;

public interface UserAlbumMapper  {
    int insert(UserAlbum record);

    int insertSelective(UserAlbum record);
}