package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
}
