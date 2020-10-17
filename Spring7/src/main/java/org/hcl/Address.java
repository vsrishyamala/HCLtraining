package org.hcl;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	private String line1;
	private String line2;
	private String city;
	private String pinCode;
	public Address()
	{
		
	}
	public Address(String line1, String line2, String city, String pinCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public void display()
	{
		System.out.println("Address: "+line1+"\n"+line2+"\n"+city+"\n"+pinCode);
	}

}
