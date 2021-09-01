package com.learn.springsecurity.controller;


import com.learn.springsecurity.Models.User;
import com.learn.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/")
   public List<User> getAllUser(){
    return this.userService.getAllUsers();
    }


    @GetMapping("/{userName}")
    public User GetSingleUser(@PathVariable("userName") String userName){
        return this.userService.singleUser(userName);
    }

    @PostMapping("/add-user")
    public User AddSingleUser(@RequestBody User user){
        return this.userService.AddUser(user);
    }

}
