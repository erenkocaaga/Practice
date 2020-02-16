package com.geeksforgeeks.tutorials.java.interviewfaq;

// filename Test.java 
public class OverloadingStaticMethod { 
	public static void foo() { 
		System.out.println("Test.foo() called "); 
	} 
	public static void foo(int a) { 
		System.out.println("Test.foo(int) called "); 
	} 
	
	/*
	 * public void foo() { System.out.println("Test.foo non-static called "); }
	 */
	
	public static void main(String args[]) 
	{ 
		OverloadingStaticMethod.foo(); 
		OverloadingStaticMethod.foo(10); 
	} 
} 

