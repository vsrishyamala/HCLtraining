package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("appConf.xml");
		Employee emp= context.getBean(Employee.class,"emp");
		emp.display();
		Address add= emp.getAddress();
		add.display();
		
	}

}
