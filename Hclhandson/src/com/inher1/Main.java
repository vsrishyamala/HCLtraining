package com.inher1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Choose Account tyep");
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		n=s.nextInt();
		s.nextLine();
		String data;
		
		if(n==1)
		{
			data=s.nextLine();
			String str[]=data.split(",");
			SavingAcc save = new SavingAcc(str[0],str[1],str[2],str[3]);
			save.display();
		}
		else
		{
			data=s.nextLine();
			String str[]=data.split(",");
			CurrAccount acc = new CurrAccount(str[0],str[1],str[2],str[3]);
			acc.display();
			
		}
		
		

	}

}
