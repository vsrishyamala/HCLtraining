package org.hcl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws ClassCastException{
		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("StringCon.xml");
		Course c1 = con.getBean(Course.class, "coruse1");
		Course c2 = con.getBean(Course.class, "course2");
		Course c3 = con.getBean(Course.class, "course3");
		CourseList course = new CourseList();
		course.insert(c1);
		course.insert(c2);
		course.insert(c3);
		course.revenue();



	}

}
