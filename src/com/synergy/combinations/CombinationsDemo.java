package com.synergy.combinations;

public class CombinationsDemo {
	
	public boolean isPossible(int a, int b, int c, int d){
		if(a==c && b==d){
			return true;
		}
		
		if(a+b <= c || a+b <= d){
			return isPossible(a+b, b, c, d) || isPossible(a, a+b, c, d);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		//boolean result = new CombinationsDemo().isPossible(1, 4, 5, 9);
		boolean result = new CombinationsDemo().isPossible(1, 2, 3, 6);
		System.out.println(result);
	}
}
