package com.synergy.frequency;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		String statement = "I live in united states";
		
		char[] statementArr = statement.toCharArray();
		
		for(int i=0; i<statementArr.length; i++){
			
			int count = 0;
			
			if(statementArr[i]==' '){
				continue;
			}
			
			for(int j=0; j<statementArr.length;j++){
				if(statementArr[i]==statementArr[j]){
					count++;
				}
			}
			
			System.out.println(statementArr[i] + " " + count);
		}
	}

}
