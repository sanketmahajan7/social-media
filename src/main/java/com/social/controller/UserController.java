package com.social.controller;

import com.social.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getAllUser(){
        List<User> users=new ArrayList<>();
        User user=new User("sanket","mahajan","s@gmail.com","123");
        users.add(user);
        return users;
    }
}
