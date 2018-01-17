package com.synex.practice;

public class StarPattern2 {

	public static void main(String[] args) {
		String star = "*****";
		int length = 5;
		for (int i = 0; i < length; i += 2) {
			String s = star.substring(0, length - i);
			System.out.println(s);
		}
	}

}
