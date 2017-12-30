package com.synergy.interview;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		reverseNumber(345);
	}
	
	public static void reverseNumber(int num){
		
		String input = Integer.toString(num);
		
		char[] inputArr = input.toCharArray();
		
		String reversed = "";
		
		for (int i = inputArr.length-1; i >=0; i--) {
			
			reversed+=inputArr[i];
			
		}
		
		System.out.println(reversed);
		
	}

}
