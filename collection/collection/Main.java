package com.collection;
import java.util.*;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		String name,str;
		double cost,deposit;
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("Enter the details of ItemType 1:");
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		deposit= s.nextDouble();
		cost = s.nextDouble();
		ItemType it= new ItemType(name,deposit,cost);
		System.out.println("Do u want to continue");
		s.nextLine();
		str=s.nextLine();
		al.add(it);
				
		if(str.equals("y"))
		{
			System.out.println("Enter the details of ItemType 2:");
			name = s.nextLine();
			deposit= s.nextDouble();
			cost = s.nextDouble();
			ItemType it1= new ItemType(name,deposit,cost);
			al.add(it1);
			System.out.println(al);
			
		}
		else
		{
			System.out.println(al);

		}

	}

}
