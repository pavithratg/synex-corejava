package com.synex.practice;

public class CountWords {
	
	public static int countWords(String input){
		String[] arr = input.split(" ");
		return arr.length;
	}
	
	public static void main(String[] args) {
		System.out.println(countWords("hi there how are you"));
	}

}
