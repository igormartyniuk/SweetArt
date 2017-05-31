package com.cakes.service;

import java.util.List;

import com.cakes.entity.Ingredient;

public interface IngredientService {

	void save(Ingredient ingredient);

	List<Ingredient> findAll();

	Ingredient findOne(int id);

	void delete(int id);

	void update(Ingredient ingredient);
	
}
