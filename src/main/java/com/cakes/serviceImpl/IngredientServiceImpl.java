package com.cakes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.dao.IngredientDao;
import com.cakes.entity.Ingredient;
import com.cakes.service.IngredientService;

@Service
public class IngredientServiceImpl implements IngredientService{

	@Autowired
	private IngredientDao ingredientDao;

	public void save(Ingredient ingredient) {
		ingredientDao.save(ingredient);
	}

	public List<Ingredient> findAll() {
		return ingredientDao.findAll();
	}

	public Ingredient findOne(int id) {
		return ingredientDao.findOne(id);
	}

	public void delete(int id) {
		ingredientDao.delete(id);
	}

	public void update(Ingredient ingredient) {
		ingredientDao.save(ingredient);
	}

	

}
