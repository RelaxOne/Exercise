package org.relaxone;

/**
 * a. 不用四则运算求两个数之和
 * b. 利用进位和相加和得到结果
 * @author zhoucw
 *
 */
public class Add_48 {
	public int add(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1 ^ num2;	// 得到各位相加之和
			num2 = (num1 & num2) << 1;	// 得到各位进位情况
			num1 = temp;
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Add_48 a = new Add_48();
		System.out.println(a.add(111, 899));
	}
}
