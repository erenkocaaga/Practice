package com.geeksforgeeks.tutorials.java.multithreading;

//Java program to demonstrat ethat a child thread 
//gets same priority as parent 

import java.lang.*;

public class ThreadPriority extends Thread {
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		// main thread priority is 6 now
		Thread.currentThread().setPriority(6);

		System.out.println("main thread priority : " + Thread.currentThread().getPriority());

		ThreadPriority t1 = new ThreadPriority();

		// t1 thread is child of main thread
		// so t1 thread will also have priority 6.
		System.out.println("t1 thread priority : " + t1.getPriority());
	}
}
