package com.prodapp.dao;

import java.util.List;

import com.prodapp.model.Product;

public interface ProductDao {
	public void addProducts(List<Product>p);
	public List<Product> getProducts();
	public void updateProducts(Product product);
	public void deleteProducts(int ProductId);
}

/*
 * public interface ProductDao {
	public void addProducts(List<Product>p);
	public List<Product> getProducts();
	public void updateProducts(Product product);
	public void deleteProducts(int ProductId);
	
}
 */
 
