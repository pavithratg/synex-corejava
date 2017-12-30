package com.synex.practice;

public class CircularPrimeV2 {

	public static void main(String[] args) {
		System.out.println(isCircular(1193));
	}

	/**
	 * checks if a given number is a circular prime number
	 * 
	 * @param num
	 * @return
	 */
	public static boolean isCircular(int num) {

		boolean flag = false;

		String numStr = String.valueOf(num);
		char[] arr = numStr.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				char tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}

			String s = String.valueOf(arr);

			if (!isPrime(Integer.parseInt(s))) {
				return flag;
			}

			if (s.equals(numStr)) {
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
