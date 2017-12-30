package com.synergy.le;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String[] args) {

		List<Person1> listP = new ArrayList<>();

		listP.add(new Person1("abc", 10));
		listP.add(new Person1("sbc", 30));
		listP.add(new Person1("ebc", 20));

		Stream<Person1> stream1 = listP.stream();

		Predicate<Person1> p1 = p -> p.getAge() > 20;
		Predicate<Person1> p2 = p -> p.getName().startsWith("s");
		Predicate<Person1> p3 = p1.and(p2);

		stream1.filter(p3).forEach(System.out::println);

	}

}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
