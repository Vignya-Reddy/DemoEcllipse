package com.prodapp.model;

/* 1)Create a Layered architecture of Product Application with Service Layer, DAO layer
It should do following operations
1)Display existing product List
2)Add list of 3 products into existing List
3)delete a data from list 
4)update list with given product name and display it again */

public class Product {
	private int productId;
	private String productName;
	private int price;
	public Product(int productId, String productName, int price) {
		//super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [ProductId =" + productId + ", ProductName=" + productName + ", price=" + price + "]";
	}
	
	
	

}
