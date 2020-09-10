package com.inher2;

public class Account {
	protected String accNo;
	protected double balance;
	protected String accHolderName;
	public Account(String accNo, double balance, String accHolderName) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accHolderName = accHolderName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	

}
