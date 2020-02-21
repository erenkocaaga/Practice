package com.crackingthecodinginterview.arraysandstrings;

public class CheckPermutation {
	
	static boolean permutation(String s, String t)
	{
		if(s.length()!= t.length()) return false; 
		
		int[] letters = new int[128]; 
		
		char[]  s_array = s.toCharArray(); 
		
		for(char c:s_array)
			letters[c]++; 
		
		for(int i = 0 ; i<t.length();i++)
		{
			letters[t . charAt(i)] --;
			if (letters[t . charAt(i)] < 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutation("eren","erer"));
	}

}
