package com.collection5;
import java.util.*;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		String name,str;
		Scanner s = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		do
		{
			System.out.println("Enter the name");
			name=s.nextLine();
			System.out.println("Do u want to continue ?");
			str=s.nextLine();
			set.add(name);
			
		}while(str.equals("y"));
		System.out.println("The unique number of username is :"+set.size());

	}

}
