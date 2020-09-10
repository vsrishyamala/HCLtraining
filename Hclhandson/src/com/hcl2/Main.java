package com.hcl2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String name,country,skill;
		Player p = new Player();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the country");
		country=s.nextLine();
		System.out.println("Enter the skill");
		skill=s.nextLine();
		p.setName(name);
		p.setCountry(country);
		p.setSkill(skill);
		System.out.println("Player Details");
		System.out.println("Player Name:" +p.getName());
		System.out.println("Player Country:" +p.getCountry());
		System.out.println("Player skill:" +p.getSkill());
		
		

	}

}
