package com.sky.repository;

import java.util.List;

import com.sky.domain.Product;

public interface ProductRepository {

	public void addProduct(Product product);
	public List<Product>getProducts();
	public Product getProductByid(String productId);
	public Product updateByID(Product product);
	public Product deleteByID(String productId);
	
}
