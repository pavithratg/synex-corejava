package com.synergy.le;

public class AnonymousInnerClassDemo {
	
	public static void main(String[] args) {
		
		int a = 2;
		//a=3;
		SampleInterface interface1 = new SampleInterface() {
			
			@Override
			public int add(int x, int y) {
				
				return x+y+a;
			}
		};
		
	}

}
