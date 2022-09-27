package com.example.user_api.service;

import com.example.user_api.model.User;
import com.example.user_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

}
