package com.shimigui.WebServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimigui.WebServices.entities.Category;
import com.shimigui.WebServices.repositories.CategoryRepository;

@Service
public class CategoryService extends EntityService<Category> {
	public CategoryService(@Autowired CategoryRepository repository) {
		super(repository);
	}

	@Override
	protected void updateData(Category entity, Category obj) {
		
	}
}
