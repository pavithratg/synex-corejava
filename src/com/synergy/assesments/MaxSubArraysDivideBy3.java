package com.synergy.assesments;

/*
 * You are given a n-size array.
 * Find the max number of sub arrays (each sub array can contain either 2-3 elements) whose sum is divisible by 3.
 * No numbers will be repeated in the sub array. 
 */

/*
 * CONSTAINTS:
 * 1) Sub array size can be either 2 or 3.
 * 2) Sum of the array will be divisible by 3.
 * 3) No numbers will be repeated.
 */

public class MaxSubArraysDivideBy3 {

	int[] arr = new int[] { 1, 4, 6, 7, 9, 20, 21, 23, 43, 56 };
	int ctr0 = 0;
	int ctr1 = 0;
	int ctr2 = 0;
	int subArrCtr = 0;

	/*
	 * This function is to evaluate the #no of elements perfectly divisible by 3
	 * or having a *reminder of either 1 or 2.
	 */
	public void manageCounts() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				// Perfectly divisible by 3
				ctr0++;
			} else if (arr[i] % 3 == 1) {
				// Reminder is 1
				ctr1++;
			} else if (arr[i] % 3 == 2) {
				// Reminder is2
				ctr2++;
			}
		}
	}

	public int maxCounts() { /*
								 * Sub array can either have 2 or three
								 * elements. Going by 2 elements sum hence
								 * dividing ctr0/2 for getting sub array size
								 * for those elements perfectly divisible by 3.
								 */
		subArrCtr = subArrCtr + ctr0 / 2;
		/*
		 * No we have to add ctr1 and ctr2 elements for making them perfectly
		 * divisible by 3.
		 */
		if (ctr1 >= ctr2) {
			subArrCtr = subArrCtr + ctr2;
			ctr1 = ctr1 - ctr2;
			subArrCtr = subArrCtr + ctr1 / 3;
		} else {
			subArrCtr = subArrCtr + ctr1;
		}

		return subArrCtr;
	}

	public static void main(String[] args) {
		MaxSubArraysDivideBy3 count = new MaxSubArraysDivideBy3();
		count.manageCounts();
		System.out.println("Max no of sub arrays: " + count.maxCounts());
	}
}