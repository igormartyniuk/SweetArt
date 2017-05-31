package com.cakes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.Cakes;

public interface CakesDao extends JpaRepository<Cakes, Integer>{

}
