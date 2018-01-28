package com.synergy.assesments;

public class MaxProductSubArrayVP {

	public static void main(String[] args)

	{

		int[] arr = { 1, 2, -1, 4, 0, 5, -6, -5, -6, 2, 0, 3, -4, 3, -2, 4, -3 };

		// int[] arr = { -3, -4, -5};

		// int[] arr = { 3, -4, 5,100};

		// int[] arr = {1, 3, -4, 0,100};

		int[] returnIndices = new int[2];

		long maxProduct = maxProduct(arr);

		System.out.println("Maximum product :" + maxProduct);

	}

	static int min(int x, int y) {
		return x < y ? x : y;
	}

	static int max(int x, int y) {
		return x > y ? x : y;
	}

	public static int maxProduct(int[] A) {

		if (A == null || A.length == 0) {

			return 0;

		}

		int max = A[0], min = A[0], result = A[0];

		for (int i = 1; i < A.length; i++) {

			int temp = max;

			max = max(max(max * A[i], min * A[i]), A[i]);

			min = min(min(temp * A[i], min * A[i]), A[i]);

			if (max > result) {

				result = max;

			}

		}

		return result;

	}

}
