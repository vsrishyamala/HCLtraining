package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("appContext.xml");
		Employee emp= con.getBean(Employee.class,"emp");
		emp.display();
		Address add=emp.getAddress();
		add.display();

	}

}
