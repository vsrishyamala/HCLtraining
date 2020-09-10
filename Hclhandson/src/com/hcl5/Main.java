package com.hcl5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name");
		String n= s.nextLine();
		System.out.println("Enter the city");
		String c = s.nextLine();
		System.out.println("Venue Details");
		Venue venue = new Venue();
		venue.setName(n);
		venue.setCity(c);
		System.out.println("Venue Name:" +venue.getName());
		System.out.println("Venue City :" +venue.getCity());
		System.out.println("Verify and update venue details");
		
		int x;
		do
		{
			System.out.println("1.update venue name");
			System.out.println("2.update venue city");
			System.out.println("3.All information correct/exit");
			
			x=s.nextInt();
			s.nextLine();
			switch(x)
			{
			case 1:
			{
				System.out.println("Enter the venue name");
				n=s.nextLine();
				venue.setName(n);
				System.out.println("Venue Details");
				System.out.println("Venue Name:" +venue.getName());
				System.out.println("Venue City :" +venue.getCity());
				break;
			}	
			case 2:
			{
				System.out.println("Enter the venue city");
				c=s.nextLine();
				venue.setCity(c);
				System.out.println("Venue Details");
				System.out.println("Venue Name:" +venue.getName());
				System.out.println("Venue City :" +venue.getCity());
				break;
			}	
			case 3:
			{
				
				System.out.println("Venue Details");
				System.out.println("Venue Name:" +venue.getName());
				System.out.println("Venue City :" +venue.getCity());
				break;
			}	
			}
			
		}while(x<=3);
		}
		
}
