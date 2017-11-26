package com.synex.sort;

/**
 * 
 * Repeatedly iterating through the list to be sorted and comparing each
 * adjacent items and swap them if they are in the wrong order. Iterating
 * through the list continues till no swaps are needed, which indicates the list
 * is sorted.
 * 
 * During the sorting process smaller items bubbles up to the top of the list,
 * hence the name.
 * 
 * worst and average - O(n*n)
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
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
		int[] arr = bubbleSort(new int[] { 5, 3, 1, 9, 8, 2, 4, 7 });

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
