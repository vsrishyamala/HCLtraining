package com.abc1;
 public class Circle extends Shape{
	float radius;
	
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	


	public double calculatePerimeter( )
	{
		
		return (2*3.14*radius);
		
	}

}
