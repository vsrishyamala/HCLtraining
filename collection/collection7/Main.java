package com.collection7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.collection8.TicketBooking;

public class Main {

	public static void main(String[] args) {
		int n, i;
		Scanner s = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		System.out.println("Enter number of customers:");
		n = s.nextInt();
		s.nextLine();
		String data[] = new String[n];
		System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
		for (i = 0; i < n; i++) {
			data[i] = s.nextLine();
			String str[] = data[i].split(",");
			CallLog tb = new CallLog(str[0], Integer.parseInt(str[1]));
			al.add( Integer.parseInt(str[1]));

		}
		try {
			System.out.println("Max is " + Collections.max(al));
			System.out.println("Min is " + Collections.min(al));
		} catch (ClassCastException | NoSuchElementException e) {
			System.out.println(e);
		}


	}

}
