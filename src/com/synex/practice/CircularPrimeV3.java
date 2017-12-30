package com.synex.practice;

public class CircularPrimeV3 {

	private static String original;

	public static void main(String[] args) {

		int num = 1193;

		System.out.println(isCircular(num));

	}

	/**
	 * checks if a given number is a circular prime number
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isCircular(int num) {

		if (!isPrime(num)) {
			return false;
		}

		String numStr = Integer.toString(num);
		original = numStr;
		System.out.println(original);
		return inCircular(numStr);

	}

	/**
	 * recursive method
	 * 
	 * @param numStr
	 * @return
	 */
	public static boolean inCircular(String numStr) {

		boolean flag = false;

		char first = numStr.charAt(0);
		String rest = numStr.substring(1, numStr.length());
		numStr = rest + first;
		// System.out.println(numStr);

		System.out.println(numStr);
		

		if (numStr.equals(original)) {

			System.out.println("match" + numStr);

			flag = true;
			return flag;

		}

		inCircular(numStr);

		return flag;

	}

	/**
	 * check if a given number is a prime number.
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isPrime(int num) {

		boolean flag = false;
		boolean isItself = false;

		int c = 0;

		for (int i = num; i >= 1; i--) {

			if (num % i == 0) {

				if (num == i) {
					isItself = true;
				}
				c++;
			}

		}

		if (c == 2 && isItself) {
			flag = true;
		}

		return flag;

	}

}
