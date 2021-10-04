package com.gastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gastore.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
