package com.example.demo.service;

import com.example.demo.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user){
        userRepository.save(user);
    }

    @Override
    public List<User> findAll(){
        Iterable<User>list = userRepository.findAll();
        return (List<User>) list;//强转成list
    }
}
