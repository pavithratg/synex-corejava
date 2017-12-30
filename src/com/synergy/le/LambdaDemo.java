package com.synergy.le;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

public class LambdaDemo {

	/**
	 * 
	 * functional interface is an interface with only one method
	 */
	public static void main(String[] args) {

		Button button = new Button("add");

		// anonymous inner class implementation.
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked");

			}
		});

		// using lambda expressions, here the functional interface is
		// ActionListener
		button.addActionListener(event -> System.out.println("button clicked"));

		// anonymous inner class
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("running");

			}
		});

		// lambda expression, the functional interface is Runnable
		t = new Thread(() -> System.out.println("running"));

		Runnable multiLine = () -> {
			System.out.println("line1");
			System.out.println("line2");
		};
		
		multiLine.run();
	
		
		BinaryOperator<Long> add = new BinaryOperator<Long>() {

			@Override
			public Long apply(Long t, Long u) {
				// TODO Auto-generated method stub
				return null;
			}
		}; 
		
		BinaryOperator<Long> add2 = (x,y) -> x+y;
		
		add2.apply(10L, 15L);
	}

}
