package com.inher2;

public class FixedAcc extends SavingAcc{
	protected int lockingPeriod;

	public FixedAcc(String accNo, double balance, String accHolderName, double minBalance, int lockingPeriod) {
		super(accNo, balance, accHolderName, minBalance);
		this.lockingPeriod = lockingPeriod;
	}

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	

}
