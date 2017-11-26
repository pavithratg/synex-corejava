package com.synergy.corejava;

public class Test {
	int i = 1_00_0;

	public static void main(String[] args) {
		System.out.println(new Test().i);
		int c = BB.c;
		//BB b = new BB();
	}

}

class AA {

	static {
		System.out.println("AA");
	}

}

class BB extends AA {
 static int c =5;
	static {
		System.out.println("BB");
	}

}
