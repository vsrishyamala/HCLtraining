package com.example6;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String str,add;
		int p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Humpty's sentence");
		str=s.nextLine();
		System.out.println("What Dumpty want to insert & where");
		add=s.nextLine();
		System.out.println("Enter position");
		p=s.nextInt();
		System.out.println("Humpty's new sentence is "+str.substring(0,p)+""+add+str.substring(p));

	}

}
