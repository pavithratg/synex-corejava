package com.synergy.assesments;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pavithra_ProducerConsumer {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t1.start();
		t2.start();

	}

}

class Producer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				queue.put(i);
				System.out.println("Producer created " + i);

			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Consumer implements Runnable {

	private BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(10000);
				int j = queue.take();
				System.out.println("Consumer consumed " + j);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
