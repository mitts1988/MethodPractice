package com.jmcolles.miscellaneous;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "())()((";
		System.out.println(correctParanthesis(str));
		System.out.println(correctParanthesisRecursive(str));
	}

	public static boolean correctParanthesisRecursive(String str) {
		System.out.println(str);
		// recurssion solution
		if (str.contentEquals("()")) {
			// smallest element is ()
			return true;
		} else if (str.startsWith("()")) {
			// remove starting ()
			return correctParanthesis(str.substring(2, str.length()));
		} else if (str.startsWith("(") && str.endsWith(")")) {
			// remove first and last character if they are ()
			return correctParanthesis(str.substring(1, str.length() - 1));
		} else {
			return false;
		}
	}

	public static boolean correctParanthesis(String str) {
		int count = 0;
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " " + count);
			if (str.charAt(i) == '(') {
				count++;
			} else if (str.charAt(i) == ')') {
				count--;
			} else {
				return false;
			}
			if (count < 0) {
				return false;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
}
