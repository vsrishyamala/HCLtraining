package com.inher1;

public class CurrAccount extends Account {
	private String  tinNumber;
	
	public CurrAccount(String accName, String accNo, String bankName, String tinNumber)
	{
		super(accName,accNo,bankName);
		this.tinNumber = tinNumber;
				
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	protected void display()
	{
		super.display();
		System.out.println("TIN Number :" +tinNumber);
	}
	

}
