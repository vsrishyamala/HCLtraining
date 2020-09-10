package com.hcl3;

public class Delivery {
	Long over ,ball,runs;
	
	String batsman,bowler, nonStriker;
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public void displayDeliveryDetails() {
		System.out.println("Delivery Details");
		System.out.println("Over:" +over);
		System.out.println("Ball:" +ball);
		System.out.println("Runs:" +runs);
		System.out.println("Batsman:" +batsman);
		System.out.println("Bowlers:" +bowler);
		System.out.println("NonStriker:" +nonStriker);

		

		

		
		
	}

}
