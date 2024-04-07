package com.shimigui.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimigui.WebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
}
