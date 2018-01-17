package com.synergy.assesments;

public class DeadLockDemo {

	public static void main(String[] args) {

		Resource r1 = new Resource();
		Resource r2 = new Resource();

		RunnableTask1 rt1 = new RunnableTask1(r1, r2);
		RunnableTask2 rt2 = new RunnableTask2(r1, r2);

		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);

		t1.start();
		t2.start();

	}

}

class RunnableTask1 implements Runnable {

	private Resource r1;
	private Resource r2;

	public RunnableTask1(Resource r1, Resource r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {

		synchronized (r1) {

			System.out.println("Lock on R1 aquired!!!###");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (r2) {
				System.out.println("Lock on R2 is aquired!!!###");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}

class RunnableTask2 implements Runnable {

	private Resource r1;
	private Resource r2;

	public RunnableTask2(Resource r1, Resource r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {

		synchronized (r2) {

			System.out.println("Lock on R2 aquired!!!@@@");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (r1) {
				System.out.println("Lock on R1 is aquired!!!@@@");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}

class Resource {

}
