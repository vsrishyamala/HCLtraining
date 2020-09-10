package com.hcl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name");
		String n= s.nextLine();
		System.out.println("Enter the city");
		String c = s.nextLine();
		System.out.println("Venue Details");
		Venue venue = new Venue(n,c);
		System.out.println("Venue Name:" +venue.getName());
		System.out.println("Venue City :" +venue.getCity());
		
	}

}
