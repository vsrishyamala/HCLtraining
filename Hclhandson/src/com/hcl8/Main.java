package com.hcl8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of wicket");
		n = s.nextInt();
		s.nextLine();
		String data[] = new String[n];
		for (i = 0; i < n; i++) {
			System.out.println("Enter the details of wicket" + i+1);
			data[i] = s.nextLine();
		}
		System.out.println("Wicket Details");
		for (i = 0; i < n; i++) {
			String str[] = data[i].split(",");
			Wicket w = new Wicket(Long.parseLong(str[0]), Long.parseLong(str[1]), str[2], str[3], str[4]);
			System.out.println("Over:" +w.getOver());
			System.out.println("Ball: "+w.getBall());
			System.out.println("WicketType:" +w.getWicketType());
			System.out.println("Playername:" +w.getPlayerName());
			System.out.println("Bowler:" +w.getBowlerName());
		}

	}

}
