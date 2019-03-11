package org.relaxone;
/**
 * a. 求 base 的 exponent　次方
 * b. (1)直接使用 Math.pow() 
 * 	  (2)将exponent分成正数，负数和 0 三种情况讨论
 * @author zhoucw
 *
 */
public class Power_12 {
	public double power(double base, int exponent) {
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		Power_12 power_12 = new Power_12();
		System.out.println(power_12.power(1.5, 0));
	}
}
