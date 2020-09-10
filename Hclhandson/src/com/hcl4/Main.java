package com.hcl4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String data;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Player Details");
		data = s.nextLine();
		String det[]=data.split(",");
		String name =det[0];
		String country =det[1];
		String skill = det[2];
		Player p=new Player(name,country,skill);
		System.out.println("Player Details");
		System.out.println("Player Name:"  +p.getName());
		System.out.println("Player Country:"  +p.getCountry());
		System.out.println("Player skill:"  +p.getSkill());
		
		

	}

}
