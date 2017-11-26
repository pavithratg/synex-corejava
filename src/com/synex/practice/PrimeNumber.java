package com.synex.practice;

/**
 * 
 * A prime number is a whole number greater than 1, whose only two whole-number
 * factors are 1 and itself. The first few prime numbers are 2, 3, 5, 7, 11, 13,
 * 17, 19, 23, and 29.
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {

		String primeNumbers = "";

		for (int i = 2; i <= 50; i++) {

			// holds the count of the numbers which can divide the current
			// number.
			int c = 0;

			// only the numbers which are less than the current number and
			// greater than 1 should be considered as eligible numbers which can
			// divide the current number.
			for (int j = i; j >= 1; j--) {

				int remain = i % j;

				// if remainder is 0, the number can divide the current number
				// also it should be either the current number or 1 we could say
				// it is a prime number.
				if (remain == 0) {
					// increment the count
					c++;
				}

			}

			// if the count is equal to 2, only then we can say, it is a prime
			// number and we will add it to the prime number list
			if (c == 2) {
				primeNumbers = primeNumbers + ", " + i;
			}

		}

		System.out.println(primeNumbers);

	}

}
