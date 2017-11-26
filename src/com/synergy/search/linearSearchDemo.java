package com.synergy.search;

/**
 * 
 * Linear search or sequential search is a method for finding a particular value
 * in a list, that consists of checking every one of its elements, one at a time
 * and in sequence, until the desired one is found.
 * 
 * Linear search is the simplest search algorithm. For a list with n items, the
 * best case is when the value is equal to the first element of the list, in
 * which case only one comparison is needed. The worst case is when the value is
 * not in the list (or occurs only once at the end of the list), in which case n
 * comparisons are needed.
 * 
 * The worst case performance scenario for a linear search is that it has to
 * loop through the entire collection, either because the item is the last one,
 * or because the item is not found. In other words, if you have N items in your
 * collection, the worst case scenario to find an item is N iterations. In Big O
 * Notation it is O(N). The speed of search grows linearly with the number of
 * items within your collection.
 * 
 * Linear searches don't require the collection to be sorted.
 *
 */
public class linearSearchDemo {

	public int linearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

}
