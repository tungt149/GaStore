package com.gastore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gastore.model.Category;
import com.gastore.repository.CategoryRepository;



@Service
public class CategoryService {
	@Autowired
	CategoryRepository repository;

	public List<Category> getAllCategory() {
		return repository.findAll();
	}

	public void addCategory(Category category) {
		repository.save(category);
	}

	public void removeCategoryById(Long id) {
		repository.deleteById(id);
	}

	public Optional<Category> getCategoryById(Long id) {
		return repository.findById(id);
	}
}
