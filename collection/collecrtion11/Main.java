package com.collecrtion11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		List<Address> al = new ArrayList<>();
		System.out.println("Enter the num of users");
		int n ;
		n=s.nextInt();
		s.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the hall " + (i + 1) + " detals");
			String data;
			data=s.nextLine();
			String[] str = data.split(",");
			Address a = new Address(str[0], str[1], str[2], Integer.parseInt(str[3]));
			al.add(a);
		}

		Collections.sort(al);
		Address.display(al);
	}


	}


