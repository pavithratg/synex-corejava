package com.synergy.assesments;

public class MaxPossibleSubArrays {

	public static void main(String[] args) {

		// input array
		int arr[] = new int[] { 1, 4, 6, 7, 9, 20,21,23,43,56 };
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// checking if the sum is divisible by 3
				if ((arr[i] + arr[j]) % 3 == 0) {
					count++;
					// printing sub arrays with 2 elements
					System.out.println("{" + arr[i] + "," + arr[j] + "}");
				}
				for (int k = j + 1; k < n; k++) {
					// checking if the sum is divisible by 3
					if ((arr[i] + arr[j] + arr[k]) % 3 == 0) {
						count++;
						// printing sub arrays with 3 elements
						System.out.println("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
					}

				}
			}
		}
		System.out.println("no of sub arrays: " + count);
	}
}
