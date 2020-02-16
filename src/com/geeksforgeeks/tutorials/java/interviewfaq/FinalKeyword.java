package com.geeksforgeeks.tutorials.java.interviewfaq;


//Java program to demonstrate different 
//ways of initializing a final variable 

final class Gfg 
{ 
	// a final variable 
	// direct initialize 
	final int THRESHOLD = 5; 
	
	// a blank final variable 
	final int CAPACITY; 
	
	// a final static variable PI 
	// direct initialize 
	static final double PI = 3.141592653589793; 
	
	// a blank final static variable 
	static final double EULERCONSTANT; 
	
	// instance initializer block for 
	// initializing CAPACITY 
	{ 
		CAPACITY = 25; 
	} 
	
	// static initializer block for 
	// initializing EULERCONSTANT 
	static{ 
		EULERCONSTANT = 2.3; 
	} 
	
	
		
} 

/*
 * class GfgInherited extends Gfg{
 * 
 * }
 */


class A
{
	final void m1() 
    {
        System.out.println("This is a final method.");
    }
}


class B extends A 
{
	/*
	 * void m1() { // COMPILE-ERROR! Can't override. System.out.println("Illegal!");
	 * }
	 */
}


public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final StringBuilder sb = new StringBuilder("Geeks"); 
        
        System.out.println(sb); 
          
        // changing internal state of object 
        // reference by final reference variable sb 
        sb.append("ForGeeks"); 
          
        System.out.println(sb);

	}

}
