package com.class5;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long over, ball, runs;
		String batsman, bowler, nonStriker;

		System.out.println("enter the overs :");
		over = s.nextLong();
		System.out.println("enter the balls :");
		ball = s.nextLong();
		System.out.println("Enter the runs");
		runs = s.nextLong();
		s.nextLine();
		System.out.println("Enter the batsman name ");
		batsman = s.nextLine();
		System.out.println("Enter the bowler name ");
		bowler = s.nextLine();
		System.out.println("Enter the nonStriker name ");
		nonStriker = s.nextLine();

		Delivery dv = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		dv.displayDeliveryDetails();
	}

	}

}
