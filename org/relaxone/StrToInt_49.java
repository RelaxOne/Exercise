package org.relaxone;

/**
 * a. ��һ���ַ���ת��������
 * b. (1) ���жϷ��ţ������ÿһλ�õ����������
 *    (2) �жϷ��ź��� Math.pow() ��������
 * @author zhoucw
 *
 */
public class StrToInt_49 {
	
	/**
	 * ���жϷ��ţ������ÿһλ�õ����������
	 * @param str
	 * @return
	 */
	public int strToInt(String str) {
		int result = 0;
		if(str.trim().length() == 0)
			return result;
		char[] chars = str.toCharArray();
		int fuhao = 0;
		if(chars[0] == '-')
			fuhao = 1;
		for (int i = fuhao ; i < chars.length ; i++) {
			if(chars[i] == '+')
				continue;
			int temp = chars[i] - '0';
			if(temp > 9 || temp < 0)
				return 0;
			result  = result * 10 + temp;
		}
		if(fuhao==1)
			return -result;
		return result;
	}
	
	/**
	 * �жϷ��ź��� Math.pow() ��������
	 * @param str
	 * @return
	 */
	public int strToInt_2(String str) {
		if(str.trim().length() == 0)
			return 0;
        char[] chars = str.toCharArray();
		int result = 0;
		for (int i = str.length()-1 ; i > 0; i--) {
			int temp = chars[i] - '0';
			if(temp > 9 || temp < 0)
				return 0;
			temp *= Math.pow(10, str.length()-1 - i);
			result += temp;
		}
		if(chars[0] == '+') {
			return result;
		}else if(chars[0] == '-') {
			return -result;
		}else {
			int temp =  chars[0] - '0';
			if(temp > 9 || temp < 0) {
				return 0;
			}else {
				temp *= Math.pow(10, str.length()-1);
				result += temp;
				return result;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "+1+23";
		StrToInt_49 toInt = new StrToInt_49();
		int result = toInt.strToInt(str);
		System.out.println(result);
	}
	
}
