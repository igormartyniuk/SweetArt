package com.cakes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.dao.ChefDao;
import com.cakes.entity.Chef;
import com.cakes.entity.Orders;
import com.cakes.service.ChefService;

@Service
public class ChefServiceImpl implements ChefService{

	@Autowired
	private ChefDao chefDao;

	public void save(Chef chef) {
		chefDao.save(chef);
	}

	public List<Chef> findAll() {
		return chefDao.findAll();
	}

	public Chef findOne(int id) {
		return chefDao.findOne(id);
	}

	public void delete(int id) {
		chefDao.delete(id);
	}

	public void update(Chef chef) {
		chefDao.save(chef);
	}

	public void addChefToOrder(Chef chef, Orders orders) {
		chef.getOrders().add(orders);
	}
	
	


}
