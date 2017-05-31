package com.cakes.service;

import java.util.List;

import com.cakes.entity.Cakes;
import com.cakes.entity.Ingredient;

public interface CakesService {

	void save(Cakes cakes);

	List<Cakes> findAll();

	Cakes findOne(int id);

	void delete(int id);

	void update(Cakes cakes);

}
