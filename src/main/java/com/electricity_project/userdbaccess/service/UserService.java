package com.electricity_project.userdbaccess.service;

import com.electricity_project.userdbaccess.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAllUsers();
    UserEntity saveUser(UserEntity userEntity);
    void deleteUser(Long id);
}
