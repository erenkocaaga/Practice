package com.geeksforgeeks.tutorials.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays.binarysearch() works for arrays which can be of 
		// primitive data type also
	
		int arr[] = { 10, 20, 15, 22, 35 }; 
        Arrays.sort(arr); 
  
        int key = 22; 
        int res = Arrays.binarySearch(arr, key); 
        if (res >= 0) 
            System.out.println(key + " found at index = " 
                                                  + res); 
        else
            System.out.println(key + " Not found"); 
  
        key = 40; 
        res = Arrays.binarySearch(arr, key); 
        if (res >= 0) 
            System.out.println(key + " found at index = " 
                                                  + res); 
        else
            System.out.println(key + " Not found"); 
        
        
        //Collections.binarysearch() works for objects Collections 
        //like ArrayList and LinkedList
        
        List<Integer> al = new ArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(10); 
        al.add(20); 
   
        // 10 is present at index 3. 
        int key2 = 10; 
        int res2 = Collections.binarySearch(al, key2); 
        if (res2 >= 0) 
            System.out.println(key2 + " found at index = " 
                                                 + res2); 
        else
            System.out.println(key2 + " Not found"); 
  
        key2 = 15; 
        res2 = Collections.binarySearch(al, key2); 
        if (res2 >= 0) 
            System.out.println(key2 + " found at index = "
                                                  + res2); 
        else
            System.out.println(key2 + " Not found"); 

	}

}
