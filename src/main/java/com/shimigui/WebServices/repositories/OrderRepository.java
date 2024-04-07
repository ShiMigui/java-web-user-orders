package com.shimigui.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimigui.WebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	
}
