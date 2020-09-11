package com.example4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String str,a,r,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the humpty's sentence");
		str= s.nextLine();
		System.out.println("Word to replace");
		a=s.nextLine();
		System.out.println("synonym");
		b=s.nextLine();
		r=str.replaceAll(a,b);
		System.out.println(r);
		

	}

}
