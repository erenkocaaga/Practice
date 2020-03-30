package com.leetcode.interviewquestions.arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TwoSumClass {

	private Set<Integer> table = new HashSet<>();

	public void add(int input) {
		if(!table.contains(input))
			table.add(input);
	}

	public boolean find(int val) {
		Iterator<Integer> i = table.iterator(); 
		
        while (i.hasNext()) 
        {
        	int target = val - i.next();
        	if(table.contains(target))
        		return true; 
        }
        return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumClass t = new TwoSumClass();
		t.add(1); 
		t.add(3); 
		t.add(5); 
		System.out.println(t.find(4));  
		System.out.println(t.find(7));

	}

}
