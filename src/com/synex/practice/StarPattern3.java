package com.synex.practice;

public class StarPattern3 {

	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {
			String s ="";
			for (int j = 0; j < 7; j++) {
				if(j>=7-i){
					s+="*";
				}else{
					s+=" ";
				}
			}
			System.out.println(s);
		}
	}

}
