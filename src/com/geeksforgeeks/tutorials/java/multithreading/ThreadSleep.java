package com.geeksforgeeks.tutorials.java.multithreading;

//Java program to illustrate 
//sleep() method in Java 

/* sleep(): This method causes the currently executing thread to sleep for the 
 * specified number of milliseconds, subject to the precision and accuracy of 
 * system timers and schedulers
*/

import java.lang.*;

public class ThreadSleep implements Runnable {
	Thread t;

	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				// thread to sleep for 1000 milliseconds
				Thread.sleep(1000);
			}

			catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new ThreadSleep());

		// call run() function
		t.start();

		Thread t2 = new Thread(new ThreadSleep());

		// call run() function
		t2.start();
	}
}

/*
 * Based on the requirement we can make a thread to be in sleeping state for a
 * specified period of time Sleep() causes the thread to definitely stop
 * executing for a given amount of time; if no other thread or process needs to
 * be run, the CPU will be idle (and probably enter a power saving mode)
 */