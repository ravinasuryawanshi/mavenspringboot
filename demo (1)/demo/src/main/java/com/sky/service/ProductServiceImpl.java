package com.sky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.domain.Product;
import com.sky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {

		System.out.println("In Service");
		if (product.getPrice() > 20)
			productRepository.addProduct(product);
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public Product getProductByid(String productId) {
		
		return productRepository.getProductByid(productId);
	}

	@Override
	public Product updateByID(Product product) {
		return productRepository.updateByID(product);
		
	}

	@Override
	public Product deleteByID(String productId) {
		
		return productRepository.deleteByID(productId);
	}
	

}
