package com.example.simpleauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simpleauth.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{

}
