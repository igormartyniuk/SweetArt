package com.cakes.service;

import java.util.List;

import com.cakes.entity.Cakes;
import com.cakes.entity.Orders;

public interface OrderService {

	void save(Orders orders);

	List<Orders> findAll();

	Orders findOne(int id);

	void delete(int id);

	void update(Orders orders);
	
	void addCakesToOrder(Orders orders, Cakes cakes);
	
}
