package com.example2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String str,str1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter humpty's sentence");
		str= s.nextLine();
		System.out.println("Enter dumpty's sentence");
		str1=s.nextLine();
		if(str.contains(str1))
		{
			System.out.println("Found");
		}
		else
			System.out.println("Not Found");

	}

}
