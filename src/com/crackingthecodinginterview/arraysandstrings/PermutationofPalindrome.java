package com.crackingthecodinginterview.arraysandstrings;

public class PermutationofPalindrome {
	
	static boolean isPermutationofPalindrome(String str)
	{
		int coundOdd = 0 ; 
		int table[] = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1]; 
		
		for(char c: str.toCharArray())
		{
			table[c-'a']++;
			if(table[c-'a']%2==1)
				coundOdd++; 
			else
				coundOdd--;
		}
		return coundOdd<=1; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPermutationofPalindrome("erenn"));
	}

}
