package com.geeksforgeeks.tutorials.java.basic;

/* When the below file is compiled as javac TwoClassWithMain.java 
 * will create two .class files as TwoClassWithMain.class and 
 * GeeksTest.class .Since each class has separate main() 
 * stub they can be tested individually. When java TwoClassWithMain 
 * is executed the output is For TwoClassWithMain class.
 * When java GeeksTest is executed the output is Geeks Test class.
 */

class TwoClassWithMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TwoClassWithMain class");
	}

}
  
class GeeksTest 
{ 
   public static void main(String[] args){ 
      System.out.println("Geeks Test class"); 
   } 
}
