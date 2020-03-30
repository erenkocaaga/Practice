package com.leetcode.interviewquestions.arraystring;

public class ValidPalindrome {

	public static boolean checkIfValidPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(str.charAt(i))) i++;
			while (i < j && !Character.isLetterOrDigit(str.charAt(j))) j--;
			if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(checkIfValidPalindrome(s));

	}

}
