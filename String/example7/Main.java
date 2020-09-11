package com.example7;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String str1,str2;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Humpty's sentence");
		str1=s.nextLine();
		System.out.println("Enter Dumpty's sentence");
		str2=s.nextLine();
		if(str1.length()== str2.length())
			System.out.println("Both have used equal number of words");
		else if(str1.length() >str2.length())
			System.out.println("Humpty has used more words");
		else
			System.out.println("Dumpty has used more words");



		

	}

}
