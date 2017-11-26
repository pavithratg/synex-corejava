package com.synergy.exception;

public class NoClassDefFoundErrorDemo {

	public ClassWithInitError getInstance() {

		ClassWithInitError c;

		try {
			c = new ClassWithInitError();
		} catch (Throwable t) {
			t.getMessage();
		}
		
		c = new ClassWithInitError();
		return c;

	}

}

class ClassWithInitError {

	// compiles fine but at runtime will throw an exception.
	static int data = 1 / 0;
}
