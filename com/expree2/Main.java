package com.expree2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		String name;
		double d,c;
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		try {
			name= bf.readLine();
			System.out.println("Enter the deposit");
			d=Double.parseDouble(bf.readLine());
			System.out.println("Enter cost per day");
			c=Double.parseDouble(bf.readLine());
			ItemType i=new ItemType(name,d,c);
			System.out.println(i);
						
		}
		catch(NumberFormatException nf)
		{
			nf.printStackTrace();
		}	

	}

}
