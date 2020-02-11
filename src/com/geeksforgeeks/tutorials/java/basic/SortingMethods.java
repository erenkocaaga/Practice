package com.geeksforgeeks.tutorials.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 }; 
		
		System.out.printf("Original arr[] : %s", Arrays.toString(arr)); 
        System.out.println("");
		  
        Arrays.sort(arr); 
        System.out.println("After the use of Arrays.sort()");
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
        System.out.println("");
        System.out.println("");
        
     // Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        System.out.println("Original List:\n" + al); 
        
        Collections.sort(al); 
  
        // Let us print the sorted list 
        System.out.println("List after the use of" + " Collection.sort() :\n" + al); 
	}

}
