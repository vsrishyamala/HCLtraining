package com.inter3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String s;
		Scanner ss = new Scanner(System.in);
		System.out.println("What you want to visit\r\n" + "Rajmachi\r\n" + "Shivgadh\r\n" + "Murud\r\n" + "");
		s=ss.nextLine();
		if(s.equals("Rajmachi"))
		{
			Fort r = new Rajmachi();
			r.distance();
		}
		else if(s.equals("Shivgadh"))
		{
			Fort r= new Shivgadh();
			r.distance();
			
		}
		else
		{
			Fort r= new Murud();
			r.distance();
		}

	}

}
