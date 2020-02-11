package com.geeksforgeeks.tutorials.java.oopconcepts;
//A Java program to illustrate Dynamic Method 
//Dispatch using hierarchical inheritance 
class A 
{ 
	int x = 10; 
	void m1() {System.out.println("Inside A's m1 method"); } 
} 

class B extends A 
{ 
	// overriding m1() 
	int x = 20; 
	void m1() { System.out.println("Inside B's m1 method"); } 
} 

class C extends A 
{ 
	// overriding m1() 
	void m1() { System.out.println("Inside C's m1 method"); } 
} 

//Driver class 
public class RuntimePolymorphisim 
{ 
	public static void main(String args[]) 
	{ 
		
		A a = new A(); 	
		B b = new B(); 
		C c = new C(); 

		A ref; 
		ref = a; 
		ref.m1(); 

		ref = b; 
		ref.m1(); 

		ref = c; 
		ref.m1(); 
		
		//In Java, we can override methods only, not the variables(data members), 
		//so runtime polymorphism cannot be achieved by data members
		
		A aa = new B(); // object of type B 
        // Data member of class A will be accessed 
        System.out.println(aa.x); 
        
		// both the class A(super class) and B(sub class) have a common variable 
		//‘x’. Now we make object of class B, referred by ‘a’ which is of type of 
		//class A. Since variables are not overridden, so the statement “a.x” will 
		//always refer to data member of super class.
	} 
} 

