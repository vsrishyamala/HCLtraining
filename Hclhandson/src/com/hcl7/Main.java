package com.hcl7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Long over ,ball,runs;		
		String batsman,bowler, nonStriker;
		Delivery d = new Delivery();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the over");
		over = s.nextLong();
		System.out.println("Enter the ball");
		ball = s.nextLong();
		System.out.println("Enter the runs");
		runs = s.nextLong();
		s.nextLine();
		System.out.println("Enter the batsman name");
		batsman =s.nextLine();
		System.out.println("Enter the bowler name");
		bowler =s.nextLine();
		System.out.println("Enter non Striker");
		nonStriker = s.nextLine();
		d.setOver(over);
		d.setBall(ball);
		d.setRuns(runs);
		d.setBatsman(batsman);
		d.setBowler(bowler);
		d.setNonStriker(nonStriker);
		System.out.println("Delivery Details");
		System.out.println("Over:" +over);
		System.out.println("Ball:" +ball);
		System.out.println("Runs:" +runs);
		System.out.println("Batsman:" +batsman);
		System.out.println("Bowlers:" +bowler);
		System.out.println("NonStriker:" +nonStriker);

	}

}
