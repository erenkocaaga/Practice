package com.geeksforgeeks.tutorials.java.multithreading;

//Java code for thread creation by extending 
//the Thread class 

/*
Thread Class vs Runnable Interface
1. If we extend the Thread class, our class cannot extend any other class 
because Java doesn’t support multiple inheritance. But, if we implement 
the Runnable interface, our class can still extend other base classes.
2. We can achieve basic functionality of a thread by extending Thread class 
because it provides some inbuilt methods like yield(), interrupt() etc. 
that are not available in Runnable interface.
*/

class Multithreading extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

class MultithreadingRunnable implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

//Main Class 
public class MultithreadingDemo {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Multithreading object = new Multithreading();
			object.start();

			Thread objectT = new Thread(new MultithreadingRunnable());
			objectT.start();
		}
	}
}
