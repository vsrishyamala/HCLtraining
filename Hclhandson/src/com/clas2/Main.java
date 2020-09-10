package com.clas2;

import java.util.Scanner;

import com.clas1.Product;

public class Main {
	public static void buildProduct()
	{
		int productCode ;
		String productName;
		double price;
		int stock;
		ProductClass p1= new ProductClass();
		ProductClass p2= new ProductClass();		
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
	    ProductClass.checkList(p1,p2);
	    System.out.println("Discount :" +ProductClass.getDiscount(p1));
	    System.out.println("Discount :"+ ProductClass.getDiscount2(p2));

	}

	public static void main(String[] args) {
		
		
		buildProduct();
		
	}

}
