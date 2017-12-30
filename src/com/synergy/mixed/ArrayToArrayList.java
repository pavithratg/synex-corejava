package com.synergy.mixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5};
		
		// returns an unmodifiable List.
		List<Integer> list = Arrays.asList(arr);
		
		//list.remove(0);
		
		List<Integer> list2 = new ArrayList<>(list);
		
		list2.remove(0);
		
		
	}

}
