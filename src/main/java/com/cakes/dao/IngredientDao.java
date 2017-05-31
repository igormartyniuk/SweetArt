package com.cakes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.Ingredient;

public interface IngredientDao extends JpaRepository<Ingredient, Integer> {


}
