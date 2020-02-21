package com.crackingthecodinginterview.arraysandstrings;

/*
 * Is Unique: Implement an algorithm to determine if a string has all unique 
 * characters. What if you cannot use additional data structures?
 */

public class IsUniqueCharacters {
	
	static boolean isUniqueChars(String str)
	{
		if(str.length()>128) return false; 
		
		boolean[] char_set = new boolean[26]; 
		
		for(int i = 0; i<str.length();i++)
		{
			if(char_set[str.charAt(i)-'a'])
				return false;
			char_set[str.charAt(i)-'a'] = true;
		}
		
		return true; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isUnique = isUniqueChars("eren");
		System.out.println(isUnique);
		
	}

}
