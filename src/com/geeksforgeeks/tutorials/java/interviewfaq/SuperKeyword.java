package com.geeksforgeeks.tutorials.java.interviewfaq;

/* Base class vehicle */
class Vehicle 
{ 
	int maxSpeed = 120; 
} 

/* sub class Car extending vehicle */
class Car extends Vehicle 
{ 
	int maxSpeed = 180; 

	void display() 
	{ 
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + super.maxSpeed); 
	} 
} 

/* Base class Person */
class Person 
{ 
    void message() 
    { 
        System.out.println("This is person class"); 
    } 
    
    
} 
  
/* Subclass Student */
class Student extends Person 
{ 
    void message() 
    { 
        System.out.println("This is student class"); 
    } 
  
    // Note that display() is only in Student class 
    void display() 
    { 
        // will invoke or call current class message() method 
        message(); 
          
        // will invoke or call parent class message() method 
        super.message(); 
        
        
    } 
} 

/* superclass Person */
class Person2 
{ 
	Person2() 
	{ 
		System.out.println("Person2 class Constructor"); 
	} 
} 

/* subclass Student extending the Person class */
class Student2 extends Person2 
{ 
	Student2() 
	{ 
		// invoke or call parent class constructor 
		super();

		System.out.println("Student2 class Constructor"); 
	} 
} 

/* Driver program to test */
public class SuperKeyword 
{ 
	public static void main(String[] args) 
	{ 
		Car small = new Car(); 
		small.display(); 
		
		Student s = new Student(); 
		  
        // calling display() of Student 
        s.display();
        
        Student2 s2 = new Student2(); 
	} 
} 
