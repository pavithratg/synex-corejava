package com.synergy.concurrency;

import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ExecutorDemo {

	public static void main(String[] args) {

		MyRunnableTask task1 = new MyRunnableTask();
		MyRunnableTask task2 = new MyRunnableTask();
		MyRunnableTask task3 = new MyRunnableTask();
		// Executor ex = Executors.newCachedThreadPool();
		Executor ex = Executors.newFixedThreadPool(2);
		ex.execute(task1);
		ex.execute(task2);
		ex.execute(task3);
		
		//ex.execute(new FutureTask<>(callable));

	}

}

class MyRunnableTask implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}

	}
}
