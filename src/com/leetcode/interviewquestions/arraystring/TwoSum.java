package com.leetcode.interviewquestions.arraystring;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) { 
		Map<Integer, Integer> map = new HashMap<>(); 
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			if (map.containsKey(target - x)) {
				return new int[] { map.get(target - x) + 1, i + 1 }; 
			}
			map.put(x, i); 
		}
		throw new IllegalArgumentException("No two sum solution"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,6,7,8,9,123,2352,23,21,32,45};
		int target = 15; 
		
		int [] ress = twoSum(nums,target); 	

	}

}
