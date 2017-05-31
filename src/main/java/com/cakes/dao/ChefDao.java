package com.cakes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.Chef;

public interface ChefDao extends JpaRepository<Chef, Integer> {

	
	
}
