package org.relaxone;

/**
 * a. ѭ������ n ���ַ���ĩβ
 * b. ��ȡ 0-n ���ַ�����ƴ�ӳ��µ��ַ�������
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
