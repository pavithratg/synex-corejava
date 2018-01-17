package com.synergy.serialization;

public class NthOddNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 7, 9, 3, 5, 4, 2, 1, 3 };
		System.out.println(nthOddnumer(arr, 4));
	}

	public static int nthOddnumer(int[] arr, int n) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
				if (count == n) {
					return arr[i];
				}
			}
		}

		return -1;
	}

}
