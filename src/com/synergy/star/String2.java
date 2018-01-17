package com.synergy.star;

/*
   *
   **
   ***
   ****
   *****
 */
public class String2 {
	
	static int n=5;
	
	public static void main(String[] args) {
		for(int i=0;i<n;i++){
			String s ="";
			for(int j=0;j<n;j++){
				if(j<=i){
					s+="*";
				}else{
					s+=" "; 
				}
			}
			System.out.println(s);
		}
	}

}
