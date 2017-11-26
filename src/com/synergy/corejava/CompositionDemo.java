package com.synergy.corejava;

public class CompositionDemo {
	
	Job job = new Job("Manager", 8000);
	
	// person object is tightly coupled to Job object. 
	Person person = new Person("Jeff", job);

}

class Job {

	private String type;
	private int Salary;

	public Job(String type, int salary) {
		super();
		this.type = type;
		Salary = salary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}

class Person {
	private String name;

	// has-a
	private Job job;

	public Person(String name, Job job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}
