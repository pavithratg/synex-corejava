package com.synergy.corejava;

/**
 * 
 * Binding of static, private and final methods are done at compile time
 *
 */
public class StaticBindingDemo {

	public static void main(String[] args) {
		A a = new B();
		a.print();
	}

}

class A {

	public static void print() {
		System.out.println("printing from A");
	}

}

class B extends A {

	public static void print() {
		System.out.println("printing from B");
	}

}
