package com.synergy.exception;

import org.junit.Test;

public class NoClassDefFoundErrorDemoTest {

	@Test(expected = NoClassDefFoundError.class)
	public void testGetInstance() {
		NoClassDefFoundErrorDemo n = new NoClassDefFoundErrorDemo();
		n.getInstance();
	}

}
