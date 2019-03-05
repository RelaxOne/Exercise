package org.relaxone;

public class LeftRotateString {
	
	public static String leftRotateString(String str, int n) {
		String str1 = str.substring(0, n);
		String str2 = str.substring(n);
		return str2+str1;
	}
	
	public static void main(String[] args) {
		String str = "abcXYZdef";
		System.out.println(leftRotateString(str, 3));
	}
	
}
