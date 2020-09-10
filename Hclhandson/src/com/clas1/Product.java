package com.clas1;

public class Product {
	private int productCode ;
	private String productName;
	private double price;
	private int stock;
	public Product()
	{
		
	}
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public static void checkList(double a, double b1 ,String c ,String d)
	{
		
		if(a<b1)
	    {
	    	System.out.println(c +" is cheaper then"+ d);
	    }
	    else
	    {
	    	System.out.println(d +" is cheaper then "+c);
	    }
	}

	
	
}
