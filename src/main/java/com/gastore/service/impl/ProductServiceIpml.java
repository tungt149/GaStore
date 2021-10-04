package com.gastore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastore.model.Product;
import com.gastore.repository.ProductRepository;
import com.gastore.service.ProductService;

@Service
public class ProductServiceIpml implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}

}
