package com.hcl;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
	
	private List<Course> course;
	
	public void insert(Course courses)
	{
		course.add(courses);
		System.out.println(courses);
	}
	
	public List<String> noOfCourse(Double budget) {
		List<String> list = new ArrayList();
		for (Course course : course) {
			if (budget >= course.getFee()) {
				int i= (int) (budget / course.getFee());
				String str = course.getName() + "-" + i;
				list.add(str);
			}
		}
		return list;
	}

}
