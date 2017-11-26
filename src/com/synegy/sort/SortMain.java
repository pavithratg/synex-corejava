package com.synegy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.synegy.model.Student;

public class SortMain {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "dbc");
		Student s2 = new Student(2, "abd");
		Student s3 = new Student(3, "gft");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
		
	}

}
