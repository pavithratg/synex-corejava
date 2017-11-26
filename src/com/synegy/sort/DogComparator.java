package com.synegy.sort;

import java.util.Comparator;

import com.synegy.model.Dog;

public class DogComparator implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getColor().compareTo(o2.getColor());
	}

}
