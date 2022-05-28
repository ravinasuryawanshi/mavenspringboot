package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {
	public void addProduct(Product product);

	public List<Product> getProducts();

	public Product getProductByid(String productId);
	public Product updateByID(Product product);
	public Product deleteByID(String productId);
	

	
		
		
	}
	

