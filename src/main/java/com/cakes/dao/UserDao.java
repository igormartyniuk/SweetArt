package com.cakes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByName(String name);
    User findByEmail(String email);
	
}
