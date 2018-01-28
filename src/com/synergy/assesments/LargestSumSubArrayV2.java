package com.synergy.assesments;

/**
 * 
 * Problem : find the sum and sub array(continuous) which has max possible sum,
 * out of a given integer array(which contains positive or negative integers)
 *
 */
public class LargestSumSubArrayV2 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, -5, 0, 6, -8 };

		int currentStart = 0;
		int currentEnd = 0;
		int currentSum = 0;
		int maxStart = 0;
		int maxEnd = 0;
		int maxSum = 0;

		while (currentEnd != arr.length) {

			currentSum += arr[currentEnd];

			if (currentSum > maxSum) {
				maxSum = currentSum;
				maxStart = currentStart;
				maxEnd = currentEnd;
			}

			// handling the negative sums
			if (currentSum <= 0) {
				currentStart = currentEnd + 1;
				currentSum = 0;
			}

			currentEnd++;

		}

		System.out.println("Maximum Sum: " + maxSum);
		System.out.println("From " + maxStart + " To: " + maxEnd);

	}

}
