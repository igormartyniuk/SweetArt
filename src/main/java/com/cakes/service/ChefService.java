package com.cakes.service;

import java.util.List;

import com.cakes.entity.Chef;
import com.cakes.entity.Orders;

public interface ChefService {

	void save(Chef chef);

	List<Chef> findAll();

	Chef findOne(int id);

	void delete(int id);

	void update(Chef chef);
	
	void addChefToOrder(Chef chef, Orders orders);
	
}
