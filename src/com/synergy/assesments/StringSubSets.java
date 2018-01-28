package com.synergy.assesments;

public class StringSubSets {
	int gindex = 0;

	public boolean subSets(int index, String sString, String original) {
		if (index == original.length()) {
			gindex++;
			if(gindex==original.length()){
				return true;
			}
			index = gindex;
		}
		for (int i = index; i < original.length(); i++) {
			//System.out.println(gindex + " " + index);
			String s = original.substring(gindex, index+1);
			System.out.println(s);
			index++;
			if(subSets(index, s, original)){
				return true;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		new StringSubSets().subSets(0, "", "abcd");
	}

}
