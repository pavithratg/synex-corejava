package com.synergy.exception;

public class UserNameException {

	public static final String EXCEPT = "prabhat";

	public static void main(String[] args) {
		try {
			new UserNameException().printName("prabhat");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	public void printName(String name) throws MyException {

		if (EXCEPT.equals(name)) {
			throw new MyException("Name " + name + " is not allowed!");
		}

		System.out.println("Name is " + name);

	}

}
