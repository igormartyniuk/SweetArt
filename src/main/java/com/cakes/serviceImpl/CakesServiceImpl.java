package com.cakes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.dao.CakesDao;
import com.cakes.entity.Cakes;
import com.cakes.entity.Ingredient;
import com.cakes.service.CakesService;

@Service
public class CakesServiceImpl implements CakesService{

	@Autowired
	private CakesDao cakesDao;

	public void save(Cakes cakes) {
		cakesDao.save(cakes);
	}

	public List<Cakes> findAll() {
		return cakesDao.findAll();
	}

	public Cakes findOne(int id) {
		return cakesDao.findOne(id);
	}

	public void delete(int id) {
		cakesDao.delete(id);
	}

	public void update(Cakes cakes) {
		cakesDao.save(cakes);
	}

	public void addIngredientToCake(Cakes cakes, Ingredient ingredient) {
		cakes.getIngredient().add(ingredient);
		
	}

	
	
	


}
