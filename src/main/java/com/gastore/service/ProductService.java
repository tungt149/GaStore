package com.gastore.service;

import java.util.List;

import com.gastore.model.Product;

public interface ProductService {
	List<Product> getAllProduct();

	void addProduct(Product product);
}
