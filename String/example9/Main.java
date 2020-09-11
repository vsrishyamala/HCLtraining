package com.example9;

import java.util.*;

public class Main {
	public static boolean test(String str)
	{
		char a[]= str.toCharArray();

	    for(int i=0;i<a.length;i++)
	    {
		     if(!Character.isUpperCase(a[i]))
		 	     return false;
		   
	     }
	    return true;
	}

	public static void main(String[] args) {
		String str;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter humpty's sentence");
		str= s.nextLine();
		Boolean  t=test(str);
		if(t)
			System.out.println("String is in upper case");
		else
			System.out.println("String is not in upper case");
		
		

	}

}
