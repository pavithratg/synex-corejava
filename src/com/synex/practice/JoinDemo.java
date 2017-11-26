package com.synex.practice;

public class JoinDemo {

	public static void main(String[] args) {
		
		
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "is running");
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
