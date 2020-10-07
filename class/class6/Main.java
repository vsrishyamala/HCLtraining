package com.class6;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name, country, skill;
		String input;
		String[] data;
		System.out.println("Enter the player Details :");
		input = s.nextLine();
		data = input.split(",");
		
		Player p = new Player(data[0],data[1],data[2]);
		p.displayPlayerDetails();

	}

}
