package com.geeksforgeeks.tutorials.java.basic;

/*
 * We cannot call a non-static method on a reference variable with null value, 
 * it will throw NullPointerException, but we can call static method with 
 * reference variables with null values. Since static methods are bonded using 
 * static binding, they won’t throw Null pointer Exception.
 */

public class NonStaticReferencewithNull {

	public static void main(String args[]) 
    { 
		NonStaticReferencewithNull obj= null; 
        obj.staticMethod(); 
        obj.nonStaticMethod();                              
    } 
      
    private static void staticMethod() 
    { 
        //Can be called by null reference 
        System.out.println("static method, can be called by null reference"); 
          
    } 
          
    private void nonStaticMethod() 
    { 
        //Can not be called by null reference 
        System.out.print(" Non-static method- "); 
        System.out.println("cannot be called by null reference"); 
          
    } 

}
