package com.synergy.star;

/*
 	*  
   *** 
  *****
 */
public class Star4 {

	static int n = 3;

	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			String s = "";
			for (int j = 0; j < 2 * n - 1; j++) {

				if (j >= n - i - 1 && j <= n + i - 1) {
					s += "*";
				} else {
					s += " ";
				}
			}
			System.out.println(s);
		}
	}

}
