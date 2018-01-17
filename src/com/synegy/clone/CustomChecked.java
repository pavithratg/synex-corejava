package com.synegy.clone;

public class CustomChecked {
	
	public void m1() throws MyException{
		throw new MyException();
	}

}

class MyException extends Exception{
	
}
