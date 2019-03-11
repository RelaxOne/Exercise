package org.relaxone;

/**
 * a. 求整数中二进制码中 1的个数，其中负数用补码表示
 * b. 利用 Integer.toBinaryString() 方法将数字转换成对应的二进制字符串
 * @author zhoucw
 *
 */
public class NumberOf1_11 {
	public int numberOf1(int n) {
		int result = 0;
		String string = Integer.toBinaryString(n);
		for(int i = 0;i<string.length() ;i++) {
			if(string.charAt(i)=='1')
				result++;
		}
		return result;
	}
	public static void main(String[] args) {
		NumberOf1_11 numberOf1_11 = new NumberOf1_11();
		System.out.println(numberOf1_11.numberOf1(5));
	}
}
