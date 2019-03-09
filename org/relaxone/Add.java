package org.relaxone;

public class Add {
	public int add(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1 ^ num2;
			num2 = (num1 & num2) << 1;
			num1 = temp;
		}
		return num1;
	}
	
	public static void main(String[] args) {
		Add a = new Add();
		System.out.println(a.add(111, 899));
	}
}
