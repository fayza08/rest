package com.example.user_api.controller;

import com.example.user_api.model.User;
import com.example.user_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService mUserService;

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> userList = mUserService.getUsers();
        return userList;
    }

}
