package com.shimigui.WebServices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shimigui.WebServices.entities.Category;
import com.shimigui.WebServices.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource extends EntityResource<Category> {
	public CategoryResource(@Autowired CategoryService service) {
		super(service);
	}
}
