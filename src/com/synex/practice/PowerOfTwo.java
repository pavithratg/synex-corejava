package com.synex.practice;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int num) {

		boolean isPowerOfTwo = false;

		while (num % 2 == 0) {

			if (num == 1)
				break;

			if (num % 2 == 0) {
				isPowerOfTwo = true;
			} else {
				isPowerOfTwo = false;
			}

			num = num / 2;
		}

		return isPowerOfTwo;

	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));
	}

}
