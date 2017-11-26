package com.synergy.reverse;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String testString = "hello world how are you";
		
		char[] c = testString.toCharArray();
		
		int len = testString.length();
		
		for(int i = len-1;i>=0;i--){
			System.out.print(c[i]);
		}
		
	}
	
	

}
