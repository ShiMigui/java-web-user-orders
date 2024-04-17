package com.shimigui.WebServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimigui.WebServices.entities.Order;
import com.shimigui.WebServices.repositories.OrderRepository;

@Service
public class OrderService extends EntityService<Order> {
	public OrderService(@Autowired OrderRepository repository) {
		super(repository);
	}

	@Override
	protected void updateData(Order entity, Order obj) {

	}
}