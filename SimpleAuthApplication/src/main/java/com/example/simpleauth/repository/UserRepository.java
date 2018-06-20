package com.example.simpleauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleauth.model.User; 

public interface UserRepository extends JpaRepository<User, Integer>{

}
