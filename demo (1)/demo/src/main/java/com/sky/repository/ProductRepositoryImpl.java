package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;
@Repository
public class ProductRepositoryImpl implements ProductRepository {

	
	private static List<Product> products=new ArrayList<Product>();
	
	@Override
	public void addProduct(Product product) {
		System.out.println("in repository");
		System.out.println(product);
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		
		return products;
	}

	@Override
	public Product getProductByid(String productId) {
		
		for (Product product : products) {
			if(product.getProductId().equals(productId)) {
				System.out.println(product.getProductName());
				System.out.println(product.getPrice());
				System.out.println(product.getProductId());
				
				return product;
			}
		}
		return null;
	}

	

	@Override
	public Product deleteByID(String productId) {
		int index=0;
		for (Product product : products) {
			if(product.getProductId().equals(productId)) {
				 products.remove(index);
				 return product;
			}
			index=index+1;
			
		}
		return null;
	}

	@Override
	public Product updateByID(Product Newproduct) {
		int index=0;
		for (Product product : products) {
			if(product.getProductId().equals(Newproduct.getProductId())) {
				
		products.set(index, Newproduct);
			return Newproduct;
			}
		
			index=index+1;
		}
		return null;
	}
}


