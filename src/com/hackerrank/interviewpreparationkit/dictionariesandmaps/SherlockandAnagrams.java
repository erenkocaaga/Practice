package com.hackerrank.interviewpreparationkit.dictionariesandmaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    	int counter = 0; 
    	HashMap<int[], Integer> map = new HashMap<int[], Integer>();
    	ArrayList<String> subStrings = getSubString(s);
    	
    	
    	for (int i = 0; i< subStrings.size()-1;i++)   		
    		for(int j=i+1;j<subStrings.size();j++)
    			if(isAnagram(subStrings.get(i), subStrings.get(j)))
    				counter++;
    	
    	return counter; 

    }
    
    static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] lettermap = new int[26];
        for(int j=0; j<a.length(); j++){
            char ch = a.charAt(j);
            lettermap[ch - 'a']++;
            ch = b.charAt(j);
            lettermap[ch - 'a']--;
        }

        for(int j=0; j<lettermap.length; j++){
            if(lettermap[j] != 0){
                return false;
            }
        }
        return true;
    }
    
    static ArrayList<String> getSubString(String str) 
    { 
    	ArrayList<String> subStrings = new ArrayList<String>();
    	for (int i = 0; i < str.length(); i++)  
    		for (int j = i+1; j <= str.length(); j++)          
    			subStrings.add(str.substring(i, j)); 
    	
    	return subStrings;
    } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }

        scanner.close();
    }
}
