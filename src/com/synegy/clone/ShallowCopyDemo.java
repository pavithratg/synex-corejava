package com.synegy.clone;

/**
 * 
 * Cloning is the process of creating an exact copy of an object present in the
 * memory. 
 * 
 * There are two types of cloning 
 * 
 * 1. Shallow cloning, this is the
 * default cloning. Here all the primitive variable values are copied to the
 * clone's variables and the object references share the objects with the
 * original object, the copy of those objects are not created. So in Shallow
 * copy the cone is not 100% disjoint from the original object.
 * 
 * 2. Deep cloning
 * Deep cloning, we have to override the object's clone() method in our class. 
 * In deep cloning all the primitive variable values of original is copied to 
 * clones primitive variables. All the objects referred by the reference variables
 * of original are cloned and assigned to clones reference variables. 
 * so the clone is 100% disjoint from original.
 *
 */
public class ShallowCopyDemo {
	
	public static void main(String[] args) {
		Course course = new Course(1, "Algorithms");
		Student student = new Student(101, "Pavithra", course);
		
		try {
			Student studentClone = (Student) student.clone();
			System.out.println(studentClone.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Course {
	int courseId;
	String description;

	public Course(int courseId, String description) {
		super();
		this.courseId = courseId;
		this.description = description;
	}

}

class Student implements Cloneable {

	int studentId;
	String name;
	Course course;

	public Student(int studentId, String name, Course course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
