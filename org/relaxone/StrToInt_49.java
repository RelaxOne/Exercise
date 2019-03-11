package org.relaxone;

/**
 * a. 将一个字符串转换成数字
 * b. (1) 先判断符号，后遍历每一位得到结果做连乘
 *    (2) 判断符号后用 Math.pow() 方法计算
 * @author zhoucw
 *
 */
public class StrToInt_49 {
	
	/**
	 * 先判断符号，后遍历每一位得到结果做连乘
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
	 * 判断符号后用 Math.pow() 方法计算
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
