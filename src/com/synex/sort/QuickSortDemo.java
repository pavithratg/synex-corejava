package com.synex.sort;

/**
 * 
 * Quicksort or partition-exchange sort, is a fast sorting algorithm, which is
 * using divide and conquer algorithm. Quicksort first divides a large list into
 * two smaller sub-lists: the low elements and the high elements. Quicksort can
 * then recursively sort the sub-lists.
 * 
 * Steps
 * 
 * If the array contains only one element or zero elements then the array is
 * sorted.
 * 
 * If the array contains more than one element then:
 * 
 * Select an element from the array. This element is called the "pivot element".
 * For example select the element in the middle of the array.
 * 
 * All elements which are smaller than the pivot element are placed in one array
 * and all elements which are larger are placed in another array.
 * 
 * Sort both arrays by recursively applying Quicksort to them.
 * 
 * Combine the arrays.
 *
 */
public class QuickSortDemo {

	private int[] array;
	private int length;

	public void sort(int[] inputArray) {

		// if input array is null or the input array length is less than or
		// equal 1, we should not proceed ahead with the sorting process.
		if (inputArray == null || inputArray.length <= 1) {
			return;
		}

		array = inputArray;
		length = inputArray.length;

		quickSort(0, length - 1);

	}

	public void quickSort(int lowIndex, int highIndex) {

		int i = lowIndex;
		int j = highIndex;

		// choosing the pivot. Here the pivot is the middle value.
		int pivot = array[lowIndex + (highIndex - lowIndex) / 2];

		// dividing the list into two logical lists: left list and right list
		// relative to pivot.
		// Left list contains the elements left to the pivot, right list
		// contains elements right to the pivot.
		while (i <= j) {

			// if the current element from left list is less than the pivot, go
			// to the increment the position by one and move to next element,
			// else stop.
			while (array[i] < pivot) {
				i++;
			}

			// if the current element from right list is greater than pivot
			// decrement the position by one and move
			// on to the next element, or else stop.
			while (array[j] > pivot) {
				j++;
			}

			if (i <= j) {

				// swap
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

				// increment lower index by one
				i++;
				// decrement higher index by one
				j--;

			}
		}

		// recursive call to quickSort() method for partitions.
		if (lowIndex < j)
			quickSort(lowIndex, j);

		if (highIndex > i)
			quickSort(i, highIndex);

	}

}
