package com.synex.thread;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		RunnableTask t = new RunnableTask();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		//t1.join();
		t2.start();
		t3.start();
		
		t1.join();
	}

}

class RunnableTask implements Runnable{

	@Override
	public void run() {
		Thread t = new Thread(this);
		
		try {
			t.join();
			Thread.sleep(2000);
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+ " " + i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

