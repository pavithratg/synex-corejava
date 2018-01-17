package com.synergy.assesments;

/**
 * 
 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 *
 */
public class StringPermutationDemo {

	/**
	 * 
	 * @param a
	 *            String which we should permute
	 * @param s
	 *            Starting index
	 * @param e
	 *            Ending index
	 */
	public void permute(String a, int s, int e) {

		if (s == e) {
			System.out.println(a);
		}

		for (int i = s; i <= e; i++) {

			a = swap(a, s, i);
			permute(a, s + 1, e);
		}

	}

	/**
	 * 
	 * @param a
	 *            String to permute
	 * @param x
	 *            index one
	 * @param y
	 *            index two
	 * @return
	 */
	public String swap(String a, int x, int y) {
		char[] charArr = a.toCharArray();

		char tmp = charArr[x];
		charArr[x] = charArr[y];
		charArr[y] = tmp;

		return String.valueOf(charArr);
	}

	public static void main(String[] args) {

		String input = "AB";
		new StringPermutationDemo().permute(input, 0, input.length() - 1);
	}

}
