package com.learn.springsecurity.service;

import com.learn.springsecurity.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {



    List<User> list =new ArrayList<>();
    public UserService() {
        list.add(new User("abc","abc@gmail.com","1234"));
        list.add(new User("abc1","abc1@gmail.com","1234"));
        list.add(new User("abc2","abc2@gmail.com","1234"));

    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User singleUser(String UserName){
        return this.list.stream().filter((user) -> user.getUserName().equals(UserName)).findAny().orElse(null);
    }

    public User AddUser(User user){
        list.add(user);
        return user;
    }



}
