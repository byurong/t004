package com.example.service;

import com.example.pojo.User;

public interface UserService {
    Boolean add(User user);
    Boolean del(Integer uid);
    Boolean update(User user);
    User findById(Integer uid);
}
