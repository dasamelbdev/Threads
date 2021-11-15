package com.java.threads.examples.model;

public class Book {

	private int numberOfPages;
	private int numberOfPagesFinished;
	private boolean isFiftyPercentCompletedFlaged = false;
	private double percentage;

	public Book(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void read() {
		while (this.numberOfPagesFinished < this.numberOfPages) {
			this.numberOfPagesFinished++;
			System.out.println(this.numberOfPagesFinished + " out of " + this.numberOfPages + " pages finished");
			this.percentage = ((double) this.numberOfPagesFinished / (double) this.numberOfPages) * 100;
			if (this.percentage >= 50.00 && this.isFiftyPercentCompletedFlaged == false) {
				this.isFiftyPercentCompletedFlaged = true;
				synchronized (this) {
					System.out.println("50 % of the book finished so starting progress reporting.... ");
					notify();
				}
			}

		}
		System.out.println("book finished");

	}

	public void greet() {
		synchronized (this) {
			while (this.percentage < 50.00) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("started reporting  progress");

			while (this.numberOfPagesFinished < this.numberOfPages) {
				System.out.println("great !!!!. YOu have covered " + this.percentage + " from the book");
			}
			System.out.println("finished reporting  progress");
		}
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

}
