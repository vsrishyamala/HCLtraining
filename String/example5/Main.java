package com.example5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String str,remove;
		Scanner s = new Scanner (System.in);
		str=s.nextLine();
		System.out.println("Dumpty says  "+str);
		System.out.println("What Humpty want to remove");
		remove=s.nextLine();
		str= str.replaceAll(remove,"");
		System.out.println("Dumpty new sentence is "+str);

	}

}
