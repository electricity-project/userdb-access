package com.electricity_project.userdbaccess.controller;

import com.electricity_project.userdbaccess.entity.UserEntity;
import com.electricity_project.userdbaccess.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<UserEntity> findAllUsers(){
        return userService.findAllUsers();
    }
    @PostMapping
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userService.saveUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }
}
