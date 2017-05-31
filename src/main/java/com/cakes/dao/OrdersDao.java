package com.cakes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakes.entity.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer> {

}
