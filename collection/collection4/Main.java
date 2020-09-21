package com.collection4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String name,cont,user,mail;
		int n;
		ArrayList<Object> al= new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of user :");
		n=s.nextInt();
		s.nextLine();
		String data[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			data[i]=s.nextLine();
			String str[]= data[i].split(",");
			UserClass c= new UserClass(str[0],str[1],str[2],str[3]);
			al.add(c);
			
		}
    	UserClass c1= new UserClass();	
		c1.display(al);
		

	}

}
