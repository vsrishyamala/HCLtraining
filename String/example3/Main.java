package com.example3;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		String str;
		String r=" ";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter humpty's sentence");
		str=s.nextLine();
		char a[]=str.toCharArray();
		for(int i =a.length-1;i>=0; i--)
		{
			r=r+a[i];
		}
		System.out.println("Dummy says :"+ r);
	}

}
