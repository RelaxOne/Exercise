package org.relaxone;

/**
 * a. �������ж��������� 1�ĸ��������и����ò����ʾ
 * b. ���� Integer.toBinaryString() ����������ת���ɶ�Ӧ�Ķ������ַ���
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
