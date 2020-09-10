package com.inter4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int amount,year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount you want to invest:");
	    amount = s.nextInt();
		System.out.println("Enter the tenure of the SIP");
	    year = s.nextInt();
		MutualFund m = new AxisBank(amount,year);
		System.out.println("AxisBank :");
		m.amount();
		MutualFund h = new HDFC(amount,year);
		System.out.println("HDFC :");
		h.amount();
		MutualFund i = new ICICI(amount,year);
		System.out.println("ICICI :");
		i.amount();
		

	}

}
