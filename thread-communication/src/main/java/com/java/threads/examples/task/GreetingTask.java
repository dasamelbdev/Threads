package com.java.threads.examples.task;

import com.java.threads.examples.model.Book;

public class GreetingTask implements Runnable {

	private Book book;

	public GreetingTask(Book book) {
		this.book = book;
	}

	public void run() {
		book.greet();
	}

}
