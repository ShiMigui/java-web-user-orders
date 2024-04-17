package com.shimigui.WebServices.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product extends BaseEntity<Product> {
	private static final long serialVersionUID = 1L;

	private String name;
	private String description;
	private Double price;
	private String imageUrl;

	@ManyToMany
	@JoinTable(name = "tb_category_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories = new HashSet<>();

	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> items = new HashSet<>();

	public Product() {
	}

	public Product(Integer id, String name, String description, Double price, String imageUrl) {
		setId(id);
		setName(name);
		setDescription(description);
		setPrice(price);
		setImageUrl(imageUrl);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void addCategory(Category p) {
		categories.add(p);
	}

	public void removeCategory(Category p) {
		categories.remove(p);
	}

	public Set<Category> getCategories() {
		return categories;
	}

	@JsonIgnore
	public Set<Order> getOrders() {
		Set<Order> list = new HashSet<>();

		for (OrderItem i : items) {
			list.add(i.getOrder());
		}

		return list;
	}
}
