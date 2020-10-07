package com.class3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the venue name");
		String name = sc.nextLine();
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		Venue v = new Venue();
		v.displayVenueDetails(name, city);
		sc.close();

	}

}
