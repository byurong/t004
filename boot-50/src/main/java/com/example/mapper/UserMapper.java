package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    Integer add(@Param("useer0") User user);
    Integer del(Integer uid);
    Integer update(@Param("user1") User user);
    User findById(Integer uid);
}
