package com.synex.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * https://www.mathsisfun.com/greatest-common-factor.html
 *
 */
public class HighestCommonFactor {

	public static void main(String[] args) {
		System.out.println(highestCommonFactor(new int[] { 12, 6, 9 }));
	}

	public static int highestCommonFactor(int[] arr) {
		Set<Integer> set = new HashSet<>();

		int hcf = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i]; j >= 1; j--) {

				int remainder = arr[i] % j;

				if (remainder == 0) {

					// since we are finding the highest common factor, for the
					// first occurrence only we have to add values to the set.
					if (i == 0) {
						set.add(j);
					} else if (arr[i - 1] > arr[i]) {
						set.remove(arr[i - 1]);
					}
				} else {
					if (set.contains(j))
						set.remove(j);
				}

			}

		}

		for (Integer val : set) {

			if (val > hcf) {
				hcf = val;
			}

		}

		return hcf;

	}

}
