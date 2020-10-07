package com.expree1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n,m;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the cost of items for n");
		n=s.nextInt();
		System.out.println("Enter the value of m");
		m=s.nextInt();
		try
		{
			System.out.println("Cost  per day of the item is "+n/m);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		
		
		

	}

}
