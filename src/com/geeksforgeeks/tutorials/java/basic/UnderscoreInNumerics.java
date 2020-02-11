package com.geeksforgeeks.tutorials.java.basic;

public class UnderscoreInNumerics {
	
	//This feature enables us to separate groups of digits 
	//in numeric literals, which improves readability of code. 

	public static void main (String[] args) 
            throws java.lang.Exception 
	{ 
      int inum = 1_00_00_000; 
      System.out.println("inum:" + inum); 

      long lnum = 1_00_00_000; 
      System.out.println("lnum:" + lnum); 

      float fnum = 2.10_001F; 
      System.out.println("fnum:" + fnum); 

      double dnum = 2.10_12_001; 
      System.out.println("dnum:" + dnum); 
   } 

}
