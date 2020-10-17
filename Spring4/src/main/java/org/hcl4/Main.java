package org.hcl4;

import java.util.Scanner;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext();
		con.scan("org.hcl4");
		con.refresh();
		
		Owner owner= con.getBean(Owner.class);
		String name,pwd,no;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the name,password and mobileNumber of the owner");
		name=s.nextLine();
		pwd=s.nextLine();
		no=s.nextLine();
		owner.setDetails(name, pwd, no);
		owner.display();

	}

}
