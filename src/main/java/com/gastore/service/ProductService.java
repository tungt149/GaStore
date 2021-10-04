package com.gastore.service;

import java.util.List;
import java.util.Optional;

import com.gastore.model.Product;

public interface ProductService {
	List<Product> getAllProduct();

	void addProduct(Product product);

	Optional<Product> getProductById(Long id);

	List<Product> getAllProductByCategoryid(Long id);
}
