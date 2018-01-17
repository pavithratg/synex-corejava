package com.synergy.codepractice;

public class ReverseWords {
	
	public static void main(String[] args) {
		String s = "abc   bgd uhg    hgt";
		
		String[] sa = s.split("\\s+");
		
		for (int i = sa.length-1; i >= 0; i--) {
			System.out.print(sa[i] + " ");
		}
	}

}
