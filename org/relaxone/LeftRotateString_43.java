package org.relaxone;

/**
 * a. 循环左移 n 个字符到末尾
 * b. 截取 0-n 的字符串后拼接成新的字符串返回
 * @author zhoucw
 *
 */
public class LeftRotateString_43 {
	
	public String leftRotateString(String str, int n) {
		String str1 = str.substring(0, n);
		String str2 = str.substring(n);
		return str2+str1;
	}
	
	public static void main(String[] args) {
		String str = "abcXYZdef";
		LeftRotateString_43 leftRotateString_43 = new LeftRotateString_43();
		System.out.println(leftRotateString_43.leftRotateString(str, 3));
	}
	
}
