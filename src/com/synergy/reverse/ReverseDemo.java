package com.synergy.reverse;

public class ReverseDemo {
	
	public static void main(String[] args) {
		String testString = "hello world how are you";
		
		String[] s = testString.split(" ");
		
		for(int i=s.length-1; i>=0 ;i--){
			System.out.print(s[i]+ " ");
			
		}
	}

}
