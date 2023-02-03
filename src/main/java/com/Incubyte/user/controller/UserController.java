//package com.Incubyte.user.controller;
//
//import com.Incubyte.user.model.User;
//import com.Incubyte.user.service.UserService;
//import io.micronaut.http.HttpResponse;
//import io.micronaut.http.annotation.*;
//
//import java.util.List;
//
//@Controller("/api/user")
//public class UserController {
//
//    UserService userService = new UserService();
//    public UserController(UserService userService){
//        this.userService = userService;
//    }
//
//    @Post
//    public HttpResponse<User> addUser(@Body User user){
//        return HttpResponse.created(userService.addUser(user));
//    }
//    @Get
//    public HttpResponse<List<User>> getName(){
//        return HttpResponse.ok(userService.getAllUser());
//    }
//    @Get("/{id}")
//    public HttpResponse<User> getUserById(@PathVariable int id){
//        return HttpResponse.ok(userService.getUser(id));
//    }
//
//
//
//
//
//
//}
