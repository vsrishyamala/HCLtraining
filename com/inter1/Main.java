package com.inter1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n;
		String data;
		Scanner s = new Scanner(System.in);
		System.out.println("Choose StallType");
		System.out.println("1.GoldStall" +"\n"+"2.PremiumStall"+"\n"+"3.ExecutiveStall");
		n=s.nextInt();
		s.nextLine();
		if(n==1)
		{
			System.out.println("Enter Stall Details in comma separated (Stall Name, Cost, OwnerName, Number of Tvs:");
			data= s.nextLine();
			String str[]= data.split(",");
			Stall ss= new GoldStall(str[0],Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]));
			ss.display();
					
		}
		else if(n==2)
		{
			System.out.println("Enter Stall Details in comma separated (Stall Name, Cost, OwnerName, Number of projector:");
			data= s.nextLine();
			String str[]= data.split(",");
			Stall ss= new PremiumStall(str[0],Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]));
			ss.display();
		}
		else
		{
			System.out.println("Enter Stall Details in comma separated (Stall Name, Cost, OwnerName, Number of screens:");
			data= s.nextLine();
			String str[]= data.split(",");
			Stall ss= new ExecutiveStall(str[0],Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]));
			ss.display();
		}
		
		

	}

}
