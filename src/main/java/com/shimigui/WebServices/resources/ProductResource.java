package com.shimigui.WebServices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shimigui.WebServices.entities.Product;
import com.shimigui.WebServices.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource extends EntityResource<Product> {
	public ProductResource(@Autowired ProductService service) {
		super(service);
	}
}
