package com.java.threads.examples;

import com.java.threads.examples.model.Book;
import com.java.threads.examples.task.GreetingTask;
import com.java.threads.examples.task.ReadingTask;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * System.out.println("current thread  :" + Thread.currentThread().getName() +
		 * " starts");
		 * 
		 * Task task = new Task(DummyDataUtil.getList(5)); Thread t1 = new Thread(task,
		 * "t1"); t1.start();
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 5; i++) System.out.println("current thread  :" +
		 * Thread.currentThread().getName() + "  **" + i + "**");
		 * 
		 * System.out.println("current thread  :" + Thread.currentThread().getName() +
		 * "  exits");
		 */

		Book book = new Book(10);
		ReadingTask readingTask = new ReadingTask(book);
		GreetingTask greetingTask = new GreetingTask(book);

		Thread reader = new Thread(readingTask);
		Thread greeter = new Thread(greetingTask);

		greeter.start();
		reader.start();
		


	}
}
