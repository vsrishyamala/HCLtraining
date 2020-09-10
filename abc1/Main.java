package com.abc1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n;
		float radius, length, bre, side;
		Scanner s = new Scanner(System.in);
		System.out.println("List of Shape");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		n = s.nextInt();
		switch (n) {
		case 1:
		{
			System.out.println("Enter the radius of circle");
			radius = s.nextFloat();
			Shape shape = new Circle(radius);
			System.out.println("The perimeter :" + String.format("%.2f",shape.calculatePerimeter()));
			break;
		}
		case 2: 
		{
			System.out.println("Enter the length of rectangle");
			length = s.nextFloat();
			System.out.println("Enter the breadth of rectangle");
			bre = s.nextFloat();
			Shape sh = new Rectangle(length, bre);
			System.out.println("The perimeter :" + sh.calculatePerimeter());
			break;
		}
		case 3:
		{
			System.out.println("Enter the side of square");
			side= s.nextFloat();
			Shape sid = new Square(side);
			System.out.println("The perimeter :" + sid.calculatePerimeter());
			break;
		}
			

		}

	}

}
