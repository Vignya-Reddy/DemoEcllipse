package com.prodapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.prodapp.model.Product;

public class ProductDaoImpl implements ProductDao {

	List<Product> prod;

	   public ProductDaoImpl(){
	      prod = new ArrayList<Product>();
	      Product p1 = new Product(0,"Laptop",10000);
	      Product p2 = new Product(1,"E-books",500);
	      
	      prod.add(p1);
	      prod.add(p2);
	      
	   }
	   @Override
	   public void addProducts( List<Product>p) {
		   for(int i=0;i<p.size();i++) {
			   prod.add(p.get(i)); 
		   }	
	}
	   @Override
		public List<Product> getProducts() {
			return prod;
		}
	   @Override
	   public void updateProducts(Product product) {
		   System.out.println("product in Dao: "+product);
	     prod.get(product.getProductId()).setProductName(product.getProductName());
	
	      System.out.println("Product: ProductId " + product.getProductId() + ", updated with the Product name "+ product.getProductName()+ " in the database");
	   }

	
	@Override
	public void deleteProducts(int productId) {
		prod.remove(productId);
		
	}
	/*
	 * @Override
	public void deleteProducts(int productId) {
		prod.remove(productId);
		
	}*/
}
