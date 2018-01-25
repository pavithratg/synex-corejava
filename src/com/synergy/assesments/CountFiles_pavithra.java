package com.synergy.assesments;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public class CountFiles_pavithra {

	public static void main(String[] args) {

		try {
			CountFilesTask task = new CountFilesTask(new File("/Users/pavithra/test"));
			Thread t = new Thread(task);
			t.start();
			t.join();
			System.out.println(task.getCount());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class CountFilesTask implements Runnable {

	private static AtomicInteger count = new AtomicInteger(0);

	private File dir;

	public CountFilesTask(File dir) {
		super();
		this.dir = dir;
	}

	@Override
	public void run() {
		countFilesInDirectory(dir);
	}

	public void countFilesInDirectory(File directory) {

		for (File file : directory.listFiles()) {
			if (file.isFile()) {
				count.getAndIncrement();
			}
			if (file.isDirectory()) {
				CountFilesTask task = new CountFilesTask(file);
				Thread t = new Thread(task);
				t.start();
			}

		}
	}

	public File getDir() {
		return dir;
	}

	public void setDir(File dir) {
		this.dir = dir;
	}

	public AtomicInteger getCount() {
		return count;
	}

}
