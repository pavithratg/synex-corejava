package com.synex.practice;

public class PowerOfTwoV2 {

	static boolean status = false;

	public static boolean isPowerOfTwo(int num) {

		if (num == 1) {
			return status;
		}

		if (num % 2 == 0) {
			status = true;
		} else {
			status = false;
			return status;

		}
		
		num = num / 2;

		isPowerOfTwo(num);
		return status;

	}

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(10));
	}

}
