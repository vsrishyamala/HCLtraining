package org.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	ApplicationContext con=new ClassPathXmlApplicationContext("Main.xml");
	Course c1=con.getBean(Course.class,"course1");
	Course c2=con.getBean(Course.class,"course2");
	Course c3=con.getBean(Course.class,"course3");
	c1.display();
	c2.display();
	c3.display();

	
	


}
