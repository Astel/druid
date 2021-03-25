package com.alibaba.druid.spring.boot.demo.service;


import com.alibaba.druid.spring.boot.demo.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
