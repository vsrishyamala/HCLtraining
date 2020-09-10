package com.abc1;
 public class Rectangle extends Shape {
	float length,breadth;
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public double calculatePerimeter()
	{
		
		return 2*(length+breadth);
	}

}
