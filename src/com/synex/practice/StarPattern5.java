package com.synex.practice;

/*
 
    *   
   * *  
  * * * 
 * * * *
 
 */
public class StarPattern5 {
	static final int n = 4;

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < 2 * n - 1; j++) {

				/*
				 * for the combinations i odd && j even, and for the
				 * combinations i even j odd we should print star. the lower
				 * boundary for j is n-i-1 and upper boundary is n+i-1
				 * 
				 * for all the other combinations it should print a space
				 */

				// positions between upper and lower boundaries should print a star
				if (j >= n - i - 1 && j <= n + i - 1) {
					
					// choosing the correct combinations
					if (i % 2 == 0 && j % 2 != 0) {
						s += "*";
					} else if (i % 2 != 0 && j % 2 == 0) {
						s += "*";
					} else {
						s += " ";
					}
				// positions that do not include within the boundaries should print a space.
				}else{
					s+=" ";
				}

				// the other combinations of i and j
				// if (i % 2 == 0 && j % 2 == 0) {
				// s += " ";
				// }
				// if (i % 2 != 0 && j % 2 != 0) {
				// s += " ";
				// }

			}
			System.out.println(s);
		}

	}

}
