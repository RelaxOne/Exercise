package org.relaxone;
/**
 * a. �� base �� exponent���η�
 * b. (1)ֱ��ʹ�� Math.pow() 
 * 	  (2)��exponent�ֳ������������� 0 �����������
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
