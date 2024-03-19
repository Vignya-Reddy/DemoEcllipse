package com.prodapp.main;
/*  On above code use lambda expression to find thoes products whoes price is greater than 30000 , sort them and store in another list and display it*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.prodapp.model.Product;
import com.prodapp.service.ProductService;
import com.prodapp.service.ProductServiceImpl;


public class ProductDemo{

	public static void main(String[] args){
		ProductService productService = new ProductServiceImpl();
		List<Product> p =productService.getProducts();
		List<Product> prod=new ArrayList<Product>();
		prod.add(new Product(2,"AC",50000));
		prod.add(new Product(3,"SmartPhone",20000));
		prod.add(new Product(4,"Decor",2000));
		
		productService.addProducts(prod);
		List<Product> lb =productService.getProducts();
		for(Product prods:lb){
			System.out.println("Product:[ProductId : " + prods.getProductId()+ ", ProductName : " + prods.getProductName() + ", price : " + prods.getPrice()+  " ]");
			
		}
		Product product =productService.getProducts().get(2);
	    System.out.println(product);
	    product.setProductName("TV");
	    productService.updateProducts(product);
	    
	    int productId= 3;
	    productService.deleteProducts(productId);
	    System.out.println("After deleting the Product");
	    List<Product> pl=productService.getProducts();
	    for (Product pr : pl) {
	    	System.out.println("Product:[ProductId : " + pr.getProductId()+ ", ProductName : " + pr.getProductName() + ", price : " + pr.getPrice()+  " ]");
			
		   }
	    
	    List<Product> maxPrice = prod.stream()
                .filter(pro -> pro.getPrice() > 30000)
                .sorted((prod1, prod2) -> Integer.compare(prod1.getPrice(), prod2.getPrice()))
                .collect(Collectors.toList());

        System.out.println("Product with price (> 30000):");
        maxPrice.forEach(pro ->
                System.out.println("Product:[ProductId : " + product.getProductId()+ ", ProductName : " + product.getProductName() + ", price : " + product.getPrice()+  " ]"));
		

 
	}
}

/*
 * List<Product> maxPrice = prod.stream()
                .filter(pro -> pro.getPrice() > 30000)
                .sorted((prod1, prod2) -> Integer.compare(prod1.getPrice(), prod2.getPrice()))
                .collect(Collectors.toList());

        System.out.println("Product with price (> 30000):");
        maxPrice.forEach(pro ->
                System.out.println("Product:[ProductId : " + product.getProductId()+ ", ProductName : " + product.getProductName() + ", price : " + product.getPrice()+  " ]"));
		

 
	}*/
		 
	