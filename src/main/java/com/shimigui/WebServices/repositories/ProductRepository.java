package com.shimigui.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimigui.WebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
