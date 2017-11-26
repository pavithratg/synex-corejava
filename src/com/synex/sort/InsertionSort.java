package com.synex.sort;

/**
 * 
 * We can consider that there are two logical portions in the list, one is
 * sorted and the other one is unsorted.
 * 
 * For every iteration it will remove one element from the list, and insert it
 * in the correct position in the sorted portion of the list until the whole
 * list is sorted.
 * 
 * http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
 *
 */
public class InsertionSort {

	public static int[] insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}

		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = insertionSort(new int[] { 9, 7, 6, 15, 16, 5, 10, 11 });

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
