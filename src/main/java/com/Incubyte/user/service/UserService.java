package com.Incubyte.user.service;

import com.Incubyte.user.model.User;
import jakarta.inject.Singleton;

import java.util.*;
import java.util.stream.Collectors;

@Singleton
public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getAllUser(){
        return users;
    }
    public User getUser(int id){
        return users.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
    public User addUser(User user){
        users.add(user);
        return user;
    }

}
