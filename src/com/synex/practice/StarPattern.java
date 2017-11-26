package com.synex.practice;

public class StarPattern {
	
	public static void main(String[] args) {
		
		String star = "";
		for(int i=0; i<3 ; i++){
			star+="*";
			System.out.println(star);
		}
		
		char[] cstar = star.toCharArray();
		for (int i = 0; i < cstar.length-1; i++) {
			cstar[cstar.length-i-1] = ' ';
			System.out.println(String.valueOf(cstar));
		}
	}

}
