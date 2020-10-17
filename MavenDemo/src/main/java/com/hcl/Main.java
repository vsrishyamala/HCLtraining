package com.hcl;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

public class Main {

	public static void main(String[] args) {
		double i;

		ApplicationContext con = new ClassPathXmlApplicationContext("SpringConf.xml");
		List<String> noofObject = null;
		Scanner s = new Scanner(System.in);
		Course course1 = con.getBean(Course.class, "coruse1");
		Course course2 = con.getBean(Course.class, "course2");
		Course course3 = con.getBean(Course.class, "course3");
		CourseList course = new CourseList();
		System.out.println("Enter the Budget");
		i = s.nextDouble();
		course.insert(course1);
		course.insert(course2);
		course.insert(course3);

		noofObject = course.noOfCourse(i);
		if (noofObject.isEmpty()) {
			System.out.println("no courses available");
		}

	}

}
