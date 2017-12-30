package com.synex.practice;

public class CircularPrime {

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

		boolean flag = false;

		String numStr = Integer.toString(num);
		String original = numStr;

		for (int i = 0; i < numStr.length(); i++) {

			if (!isPrime(Integer.parseInt(numStr))) {
				return flag;
			}

			char first = numStr.charAt(0);
			String rest = numStr.substring(1, numStr.length());
			numStr = rest + first;
			// System.out.println(numStr);

			if (numStr.equals(original)) {

				// System.out.println("match" + numStr);

				flag = true;
				return flag;

			}

		}

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
