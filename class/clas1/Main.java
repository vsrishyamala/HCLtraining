package com.clas1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int productCode ;
		String productName;
		double price;
		int stock;
		Product p1= new Product();
		Product p2= new Product();
		Product p = new Product();
		Scanner s= new Scanner(System.in);
		System.out.println("Product Details");
		System.out.println("Enter the Product details 1:");
		productCode= s.nextInt();
		s.nextLine();
	    productName = s.nextLine();
	    price= s.nextDouble();
	    stock = s.nextInt();
	    p1.setProductCode(productCode);
	    p1.setProductName(productName);
	    p1.setPrice(price);
	    p1.setStock(stock);
	    System.out.println(" Enter the Product Details 2:");
	    productCode= s.nextInt();
		s.nextLine();
	    productName = s.nextLine();
	    price= s.nextDouble();
	    stock = s.nextInt();
	    p2.setProductCode(productCode);
	    p2.setProductName(productName);
	    p2.setPrice(price);
	    p2.setStock(stock);
	    System.out.println("Product details 1:");
	    System.out.println("ProductCode:" +p1.getProductCode());
	    System.out.println("ProductName:" +p1.getProductName());
	    System.out.println("Price: "+p1.getPrice());
	    System.out.println("Stock:" +p1.getStock());
	    System.out.println("Product details 2:");
	    System.out.println("ProductCode:" +p2.getProductCode());
	    System.out.println("ProductName:" +p2.getProductName());
	    System.out.println("Price: "+p2.getPrice());
	    System.out.println("Stock: "+p2.getStock());
	    
	    Product.checkList(p1.getPrice(),p2.getPrice(),p1.getProductName(),p2.getProductName());

	    	
	    
	    
	    
	    
	    
	    
	    
		
		
		
		

	}

}
