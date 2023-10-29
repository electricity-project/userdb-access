package com.electricity_project.userdbaccess.repository;


import com.electricity_project.userdbaccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
