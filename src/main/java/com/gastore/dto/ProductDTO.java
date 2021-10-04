package com.gastore.dto;

import lombok.Data;

@Data
public class ProductDTO {
	private Long id;
	private String name;
	private double price;
	private Long categoryId;
	private double weight;
	private String description;
	private String imageName;
}
