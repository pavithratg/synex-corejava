package com.synex.practice;

public class DuplicateNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length - 1; i++) {

			// if the current number is equal to next number in the sequence,
			// then that one is duplicated.
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
			}

		}

	}

}
