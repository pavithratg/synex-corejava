package com.synergy.assesments;

/**
 * 
 * Problem:
 * 
 * Given an integer array having positive, negative numbers with zero also.
 * 
 * find the sub array with maximum product, i.e. find the continuous array
 * elements that produce maximum product.
 *
 */
public class LargestProductSubArray {

	public static void main(String[] args) {
		// int[] arr = { 1, 3, -4, 0, 100 };
		int[] arr = { 1, 2, -1, 4, 0, 5, -6, -5, -6, 2, 0, 3, -4, 3, -2, 4, -3 };

		int currentStart = 0;
		int currentEnd = 0;
		int currentProduct = 1;
		int maxStart = 0;
		int maxEnd = 0;
		int maxProduct = 0;

		while (currentEnd != arr.length) {

			currentProduct *= arr[currentEnd];

			if (currentProduct > maxProduct) {
				maxProduct = currentProduct;
				maxStart = currentStart;
				maxEnd = currentEnd;
			}

			if (currentProduct == 0) {
				currentStart = currentEnd + 1;
				currentProduct = 1;
			}

			currentEnd++;
		}

		System.out.println("Maximum Product " + maxProduct);
		System.out.println("From " + maxStart + " To " + maxEnd);
	}

}
