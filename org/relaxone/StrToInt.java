package org.relaxone;

public class StrToInt {
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
	
	public int method_2(String str) {
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
		StrToInt toInt = new StrToInt();
		int result = toInt.method_2(str);
		System.out.println(result);
	}
	
}
