package com.expree3;
import java.util.*;
import java.util.InputMismatchException;
public class Main {
	public static void main(String args[])
	{
	try {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer");
		int x= s.nextInt();
		System.out.println("The integer is :" +x);
		
	}
	catch (InputMismatchException ioe)
	{
		System.out.println("java.util.InputMismatchException");
	}
	catch(Exception ce)
	{
		ce.printStackTrace();
	}
	
	}
}
