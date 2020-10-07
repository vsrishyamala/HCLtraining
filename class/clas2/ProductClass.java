package com.clas2;

public class ProductClass {
	public static ProductClass p1;
	public static ProductClass p2;	
	private int productCode ;
	private String productName;
	private double price;
	private int stock;
	public ProductClass()
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
	

	public static void checkList(ProductClass p1, ProductClass p2) {
		if(p1.getPrice()<p2.getPrice())
		{
			System.out.println(p1.getProductName()+" is cheaper than "+p2.getProductName());
		}
		else
			System.out.println(p2.getProductName()+" is cheaper than "+p1.getProductName());

	}
	public static double getDiscount(ProductClass p1) 
	{
		if(p1.getPrice()>=80000.0 )
		{
			return((30*p1.getPrice())/100);
		}
		else if(p1.getPrice()>=60000.0)
		{
			return((20*p1.getPrice())/100);
		}
		else if(p1.getPrice()>=50000.0)
		{
			return((10*p1.getPrice())/100);
		}
		else
		{
			return((5*p1.getPrice())/100);
		}
	
	}public static double getDiscount2(ProductClass p2) 
	{
		if(p2.getPrice()>=80000.0 )
		{
			return((30*p2.getPrice())/100);
		}
		else if(p2.getPrice()>=60000.0)
		{
			return((20*p2.getPrice())/100);
		}
		else if(p2.getPrice()>=50000.0)
		{
			return((10*p2.getPrice())/100);
		}
		else
		{
			return((5*p2.getPrice())/100);
		}
	
	}

}
