package com.prodapp.service;
/* 1)Create a Layered architecture of Product Application with Service Layer, DAO layer
It should do following operations
1)Display existing product List
2)Add list of 3 products into existing List
3)delete a data from list 
4)update list with given product name and display it again */

import java.util.List;

import com.prodapp.model.Product;


public interface ProductService {
	public void addProducts(List<Product>p); 
	public List<Product> getProducts();
	public void updateProducts(Product product);
	public void deleteProducts(int productId);
	
	
	

}
