package com.leetcode.interviewquestions.arraystring;

public class TwoSumSorted {

	public static int[] twoSum(int[] numbers, int target) { // Assume input is already sorted.
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				System.out.println(i+" "+ j);
				return new int[] { i + 1, j + 1 };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 4, 6, 7, 8, 9, 123, 2352 };
		int target = 15;

		int[] ress = twoSum(nums, target);

	}

}
