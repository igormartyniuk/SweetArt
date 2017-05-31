package com.cakes.serviceImpl;

import java.util.List;

import com.cakes.validator.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cakes.dao.UserDao;
import com.cakes.entity.Orders;
import com.cakes.entity.User;
import com.cakes.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Autowired
	@Qualifier("userValidator")
	private Validator validator;
	
	public void save(User user) throws Exception {
		validator.validate(user);
		userDao.save(user);
	}

	public List<User> findAll() {
		 return userDao.findAll();
	}

	public User findOne(int id) {
		return userDao.findOne(id);
	}

	public void delete(int id) {
		userDao.delete(id);
	}

	public void update(User user) {
		userDao.save(user);
	}

	public void addOrderToUser(User user, Orders orders) {
		user.getOrders().add(orders);
	}


}
