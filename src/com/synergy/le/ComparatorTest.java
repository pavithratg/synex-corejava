package com.synergy.le;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Person> list = Person.createShortList();

		// anonymous inner class
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});

		for (Person person : list) {

			System.out.println(person.getSurName());

		}

		// lambda expressions
		Collections.sort(list, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));

	}

	
}
