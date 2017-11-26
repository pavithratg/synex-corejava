package com.synergy.hackerrank;

import java.util.Arrays;

public class AngryChildern {

	public static void main(String[] args) {

		// Integer[] arr = { 10, 100, 300, 200, 1000, 20, 30 };

		Integer[] arr = { 1, 2, 3, 4, 10, 20, 30, 40, 100, 200 };
		Arrays.sort(arr);
		// int min = new AngryChildern().getMinUnfairness(arr, 3);
		
		int min = new AngryChildern().getMinUnfairness(arr, 4);
		System.out.println(min);

	}

	/**
	 * takes a sorted array and returns the minimum unfairness for a given k.
	 * 
	 * @param arr
	 * @return
	 */
	public int getMinUnfairness(Integer[] arr, int k) {
		int minUnfairness = 0;
		k--;
		for (int i = 0; i < arr.length - k; i++) {

			if (minUnfairness == 0)
				minUnfairness = arr[i + k] - arr[i];
			else if (minUnfairness > arr[i + k] - arr[i])
				minUnfairness = arr[i + k] - arr[i];

		}

		return minUnfairness;

	}

}
