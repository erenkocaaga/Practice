package com.crackingthecodinginterview.arraysandstrings;

public class StringCompression {
	
	static String compressBad(String s)
	{
		String res = ""; 
		
		int tot = 0;
		char last_c ='1';
		
		for(char c: s.toCharArray())
		{
			if(c!=last_c)
			{
				if(tot!=0) res = res+ last_c + tot; 			 			
				last_c = c; 
				tot = 1;
			}
			else
				tot++;
		}
		
		return res+ last_c + tot ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compressBad("aaaabbbccccccd"));
	}

}
