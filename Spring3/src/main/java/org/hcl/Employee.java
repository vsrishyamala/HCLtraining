package org.hcl;

import java.util.ArrayList;

public class Employee {
	private String empName;
	private String empEmail;
	private long empSalary;
	private ArrayList<String> empNumber;
	private Address address;
	public Employee()
	{
		
	}
	public Employee(String empName, String empEmail, long empSalary, ArrayList<String> empNumber, Address address) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
		this.empNumber = empNumber;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	public ArrayList<String> getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(ArrayList<String> empNumber) {
		this.empNumber = empNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	{
		System.out.println("Name: "+empName+"\n"+"Email: "+empEmail+"\n"+"Salary: "+empSalary+"\n"+"Phone number"+empNumber);
		
	}

}
