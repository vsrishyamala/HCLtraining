package org.hcl;

import java.util.ArrayList;
import java.util.List;


public class CourseList {
	private List<Course> course;
	public void insert(Course courses) {
		course.add(courses);
	}

	public void revenue() {
		double sum = 0;
		for (Course course : course) {
			double i = 200 * 0.2 * course.getFee();
			double j = i + course.getFee();
			sum = sum + j;
		}
		System.out.println("Total Revenue: "+sum);


}
}
