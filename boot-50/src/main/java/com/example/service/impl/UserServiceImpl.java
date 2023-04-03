package com.example.service.impl;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean add(User user) {
        int row= userMapper.add(user);
        return row>0;
    }

    @Override
    public Boolean del(Integer uid) {
        return null;
    }

    @Override
    public Boolean update(User user) {
        return null;
    }

    @Override
    public User findById(Integer uid) {
        return null;
    }
}
