package com.shimigui.WebServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimigui.WebServices.entities.Product;
import com.shimigui.WebServices.repositories.ProductRepository;

@Service
public class ProductService extends EntityService<Product> {
	public ProductService(@Autowired ProductRepository repository) {
		super(repository);
	}

	@Override
	protected void updateData(Product entity, Product obj) {
		String name = obj.getName();
		Double price = obj.getPrice();
		String imageUrl = obj.getImageUrl();
		String description = obj.getDescription();

		obj.getCategories().forEach(entity::addCategory);

		if (description != null)
			entity.setDescription(description);
		if(imageUrl!=null) 
			entity.setImageUrl(imageUrl);
		if (price != null)
			entity.setPrice(price);
		if (name != null)
			entity.setName(name);
	}
}
