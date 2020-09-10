package com.inher2;

public class AccountBo extends FixedAcc {
	
	
	public AccountBo(String accNo, double balance, String accHolderName, double minBalance, int lockingPeriod) {
		super(accNo, balance, accHolderName, minBalance, lockingPeriod);
	}

	public FixedAcc getAccDetails(String details)
	{
		String str[]=details.split(",");
		FixedAcc fx= new FixedAcc(str[0],Double.parseDouble(str[1]),str[2],Double.parseDouble(str[3]),Integer.parseInt(str[4]));
		System.out.println("Account Details");
		System.out.println("AccountNumber :" +str[0]+"\t" +"Balance :"+Double.parseDouble(str[1])+"\t"+"HolderName :"+str[2]+"\t"+"Min Balance :"+Double.parseDouble(str[3])+"\t"+"Locking Period"+Integer.parseInt(str[4]));
		return fx;
	}

}
