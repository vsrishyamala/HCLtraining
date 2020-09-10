package com.inher1;

public class SavingAcc extends Account{
	private String orgname;
	
	public SavingAcc(String accName, String accNo, String bankName,String orgname)
	{
		super(accName,accNo,bankName);
		this.orgname= orgname;
		
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	protected void display()
	{
		super.display();
		System.out.println("Organisation Name :"+orgname);
	}

}
