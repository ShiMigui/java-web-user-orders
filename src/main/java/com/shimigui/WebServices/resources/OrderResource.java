package com.shimigui.WebServices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shimigui.WebServices.entities.Order;
import com.shimigui.WebServices.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource extends EntityResource<Order> {
	public OrderResource(@Autowired OrderService service) {
		super(service);
	}
}
