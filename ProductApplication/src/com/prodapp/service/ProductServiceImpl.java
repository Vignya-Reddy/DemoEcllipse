package com.prodapp.service;

import java.util.List;


import com.prodapp.dao.ProductDao;
import com.prodapp.dao.ProductDaoImpl;
import com.prodapp.model.Product;



public class ProductServiceImpl implements ProductService{
	ProductDao dao;
	
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}
	

	@Override
	   public void addProducts(List<Product> p) {
		   dao.addProducts(p);
	   }

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return dao.getProducts();
	}

	@Override
	   public void updateProducts(Product product) {
		   dao.updateProducts(product);
	      System.out.println("Product: productId " + product.getProductId() + ", updated in the database");
	   }

	@Override
	public   void deleteProducts(int productId) {
		   dao.deleteProducts(productId);
	   }
	
	/* 	@Override
	public   void deleteProducts(int productId) {
		   dao.deleteProducts(productId);
	   }*/
	
	
	
	
	

}
