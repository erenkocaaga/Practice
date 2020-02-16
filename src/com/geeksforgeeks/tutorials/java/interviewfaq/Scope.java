package com.geeksforgeeks.tutorials.java.interviewfaq;

public class Scope {
	// All variables defined directly inside a class 
    // are member variables
    int a;
    private String b;
    char c;
    
    static int x = 11; 
    private int y = 33; 
    public void method1(int x) 
    { 
    	Scope t = new Scope(); 
        this.x = 22; 
        y = 44; 
  
        System.out.println("Scope.x: " + Scope.x); 
        System.out.println("t.x: " + t.x); 
        System.out.println("t.y: " + t.y); 
        System.out.println("y: " + y); 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scope t = new Scope(); 
        t.method1(5);
	}

}
