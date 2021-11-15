package com.java.threads.examples.task;

import com.java.threads.examples.model.Book;

public class ReadingTask implements Runnable {

	private Book book;

	public ReadingTask(Book book) {
		this.book = book;
	}

	public void run() {
		book.read();	
		}
}
