package com.abc1;

public class Square extends Shape {
	float side;
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public double calculatePerimeter()
	{
		return 4*side;
	}

}
