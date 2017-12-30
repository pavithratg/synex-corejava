package com.synergy.interview;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isPerfect(6));
		
	}

	public static boolean isPerfect(int num) {

		boolean isPerfect = false;

		int sum = 0;

		for (int i = num; i > 0; i--) {

			if (num % i == 0) {
				sum += i;
			}

		}

		if (num == (sum - num)) {

			isPerfect = true;
		}

		return isPerfect;

	}

}
