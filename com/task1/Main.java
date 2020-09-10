package com.task1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n,i,a;
		String country,air;
		System.out.println("Enter the country count");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		s.nextLine();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter country details i+1");
			country = s.nextLine();
			CountryBo c = new CountryBo();
			c.createCountry(country);
			
		}
		System.out.println("Enter the airport count");
		a=s.nextInt();
		s.nextLine();
		for(i=0;i<a;i++)
		{
			System.out.println("Enter airport details i+1");
			air=s.nextLine();
			AirportBo ap= new AirportBo();
			ap.creatAirport(air,country);
		}
		
		
	}

}
