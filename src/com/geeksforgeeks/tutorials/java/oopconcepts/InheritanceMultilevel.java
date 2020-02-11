package com.geeksforgeeks.tutorials.java.oopconcepts;

/*
 * Multilevel Inheritance : In Multilevel Inheritance, a derived class will be 
 * inheriting a base class and as well as the derived class also act as the base 
 * class to other class. In below image, the class A serves as a base class for 
 * the derived class B, which in turn serves as a base class for the derived 
 * class C. In Java, a class cannot directly access the grandparent’s members.
 */
//Java program to illustrate the 
//concept of Multilevel inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
	public void print_geekss() 
	{ 
		System.out.println("Geekss"); 
	} 
} 

class two extends one 
{ 
	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 

class three extends two 
{ 
	public void print_geeks() 
	{ 
		System.out.println("Geeks"); 
	} 
} 
//Drived class 


public class InheritanceMultilevel {

	public static void main(String[] args) {
		three g = new three(); 
		g.print_geekss(); 
		g.print_for(); 
		g.print_geeks(); 

	}

}

