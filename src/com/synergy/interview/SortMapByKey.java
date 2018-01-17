package com.synergy.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByKey {

	public static <K extends Comparable<K>, V> Map<K, V> sortByKey(Map<K, V> map) {

		Map<K, V> sortedMap = new LinkedHashMap<>();

		List<Entry<K, V>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<K, V> entry : list) {

			sortedMap.put(entry.getKey(), entry.getValue());

		}

		return sortedMap;

	}

	public static void main(String[] args) {

		Map<Employee, Integer> empMap = new HashMap<>();

		Employee emp1 = new Employee("1");
		Employee emp2 = new Employee("2");
		Employee emp3 = new Employee("3");
		Employee emp4 = new Employee("4");
		Employee emp5 = new Employee("5");

		empMap.put(emp1, 1);
		empMap.put(emp2, 2);
		empMap.put(emp3, 3);
		empMap.put(emp4, 4);
		empMap.put(emp5, 5);
		
		// before sorting
		System.out.println(empMap);

		empMap = sortByKey(empMap);

		// after sorting
		System.out.println(empMap);

	}

}

class Employee implements Comparable<Employee> {
	private String id;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Employee(String id) {
		super();
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId().compareTo(o.getId());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

}
