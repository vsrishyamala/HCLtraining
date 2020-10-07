package com.class4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Player Name :");
		String n = s.nextLine();
		System.out.println("Enter the Country Name :");
		String c = s.nextLine();
		System.out.println("Enter the Skill :");
		String sk = s.nextLine();
		Player p = new Player();
		p.displaySkills(n,c,sk);
		s.close();

	}

}
