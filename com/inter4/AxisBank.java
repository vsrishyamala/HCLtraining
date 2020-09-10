package com.inter4;

public class AxisBank implements MutualFund {
	private int amount, year;

	public AxisBank(int amount, int year) {
		super();
		this.amount = amount;
		this.year = year;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void duration()
	{
		return;
	}

	public void amount() {
		System.out.println("You will have returns as-"+amount*56/100*year);
	}

	

}
