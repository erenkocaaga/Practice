package com.crackingthecodinginterview.arraysandstrings;

/*
 * One Away: There are three types of edits that can be performed on 
 * strings: insert a character, remove a character, or replace a character. 
 * Given two strings, write a function to check if they are one edit (or 
 * zero edits) away
 */

public class OneAway {

	static boolean oneEditAway(String first, String second) {
		/* Length checks. */
		if (Math.abs(first.length() - second.length()) > 1) 
			return false;

		/* Get shorter and longer string.*/
		if(first.length()<second.length()) 
			oneEditAway(second, first); 
		
		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;

		while (index2 < second.length() && index1 < first.length()) 
		{
			if (first.charAt(index1) != second.charAt(index2)) 
			{
				if (foundDifference) return false;
				foundDifference = true;
				if (first.length() == second.length()) index1++;
			}
			else index1++; 
			index2++ ;
		 }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneEditAway("aaaaa", "aaga"));
	}

}
