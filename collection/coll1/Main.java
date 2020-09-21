package com.coll1;

import java.util.ArrayList;
import  java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		String name,str;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the username 1");
		name= s.nextLine();
		al.add(name);
		System.out.println("Do u want to continue");
		str=s.nextLine();
		if(str.equals("y"))
		{
			System.out.println("Enter the username 2");
			name=s.nextLine();
			al.add(name);
		}
		System.out.println("Names entered are");
		System.out.println(al);
		
		

	}

}
