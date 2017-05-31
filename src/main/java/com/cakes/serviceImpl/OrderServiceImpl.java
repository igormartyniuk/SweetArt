package com.cakes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakes.dao.OrdersDao;
import com.cakes.entity.Cakes;
import com.cakes.entity.Orders;
import com.cakes.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrdersDao ordersDao;

	public void save(Orders orders) {
		ordersDao.save(orders);
	}

	public List<Orders> findAll() {
		return ordersDao.findAll();
	}

	public Orders findOne(int id) {
		return ordersDao.findOne(id);
	}

	public void delete(int id) {
		ordersDao.delete(id);
	}

	public void update(Orders orders) {
		ordersDao.save(orders);
	}

	public void addCakesToOrder(Orders orders, Cakes cakes) {
		orders.getCakes().add(cakes);
	}
	
	

}
