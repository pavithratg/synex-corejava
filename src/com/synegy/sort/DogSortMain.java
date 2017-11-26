package com.synegy.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.synegy.model.Dog;

public class DogSortMain {

	public static void main(String[] args) {

		Dog d1 = new Dog("Bruno", "Brown");
		Dog d2 = new Dog("Snowy", "White");
		Dog d3 = new Dog("Clifford", "Red");
		Dog d4 = new Dog("Chip", "Black");
		Dog d5 = new Dog("Poly", "Black");

		List<Dog> dogs = new ArrayList<>();

		dogs.add(d1);
		dogs.add(d2);
		dogs.add(d3);
		dogs.add(d4);
		dogs.add(d5);
		
		System.out.println("Before removing " + dogs);

		// iterating through the ArrayList and remove a dog element based on name.
		Iterator<Dog> iterator = dogs.iterator();

		while (iterator.hasNext()) {
			Dog dog = iterator.next();

			if (dog.getName().equals("Bruno")) {
				iterator.remove();
			}

		}

		System.out.println("After removing " + dogs);
		
		// Creating a new dog object and search it in ArrayList.
		Dog dog = new Dog("Chip", "Black");
		System.out.println("Contains: "+dogs.contains(dog));
		
		// Sorting the ArrayList based on name using Comparable interface.
		Collections.sort(dogs);
		System.out.println("Soring according to name " + dogs);
		
		// Sorting according to the color using a comparator.
		Collections.sort(dogs, new DogComparator());
		System.out.println("Sorting according to color " + dogs);

	}
}
