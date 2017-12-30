package com.synergy.le;

/**
 * Note that when using lambda expressions for functional interfaces, it
 * converts five lines of code into just one statement.
 *
 */
public class RunnableTest {

	public static void main(String[] args) {

		System.out.println("#######################Runnable Test###########################");

		// Using anonymous inner class

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world 1");

			}
		};

		// using lambda expressions
		Runnable r2 = () -> System.out.println("Hello world 2");

		r1.run();
		r2.run();
	}

}
