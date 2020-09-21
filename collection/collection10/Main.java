package com.collection10;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n,i;
		Scanner s= new Scanner(System.in);
		List v = new ArrayList();
		System.out.println("Enter the number of stall details");
		n=s.nextInt();
		String data[] = new String[n];
		s.nextLine();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the stall "+i+1+" detail");
			data[i]=s.nextLine();
			v.add(data[i]);
		}
		Stall stall = new Stall();
		stall.remove(v);
		stall.display(v);
		
		

	}

}
