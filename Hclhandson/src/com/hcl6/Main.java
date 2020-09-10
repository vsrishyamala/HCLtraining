package com.hcl6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String data;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Extratype Details");
		data = s.nextLine();
		String det[]=data.split("#");
		String name =det[0];
		Long runs =Long.parseLong(det[1]);
		ExtraType p = new ExtraType(name,runs);
		
		System.out.println("Extratype Details");
		System.out.println("Extratype:"  +p.getName());
		System.out.println("Extratpype:"  +p.getRuns());
		
		

	}

}
