package com.class7;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the venue name");
		String name = s.nextLine();
		System.out.println("Enter the city name");
		String city = s.nextLine();
		Venue v = new Venue();
		v.setName(name);
		v.setCity(city);
		System.out.println("Venue Details :");
		System.out.println("Venue Name : " + v.getName());
		System.out.println("City Name : " + v.getCity());
		do {
			System.out.println("Verify and Update Venue Details");
			System.out.println("1. Update Stadium");
			System.out.println("2. Update City");
			System.out.println("3. All informations Correct/Exit ");
			n = s.nextInt();
			if (n == 1) {
				System.out.println("Enter the venue name :");
				name = s.nextLine();
				v.setName(name);
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
			} else if (n == 2) {

				System.out.println("Enter the City  name :");
				city = s.nextLine();
				v.setCity(city);
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
			} else if (n == 3) {
				System.out.println("Venue Details :");
				System.out.println("Venue Name : " + v.getName());
				System.out.println("City Name : " + v.getCity());
				break;
			}

		} while (n <= 3);

	}

}
