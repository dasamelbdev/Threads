package com.java.threads.examples.task;

import java.util.List;

public class Task implements Runnable {

	private List<Integer> list = null;

	public void run() {
		System.out.println("current thread  :" + Thread.currentThread().getName() + " starts");

		for (int x : list)
			System.out.println("current thread  :" + Thread.currentThread().getName() + " " + x);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("current thread  :" + Thread.currentThread().getName() + " exits");

	}

	public Task(List<Integer> list) {
		this.list = list;
	}

}
