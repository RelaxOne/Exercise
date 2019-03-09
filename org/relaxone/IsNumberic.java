package org.relaxone;

public class IsNumberic {
	public boolean isNumberic(char[] str) {
		if (str.length == 0 || str == null)
			return false;
		boolean hasE = false, decimal = false, sign = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'e' || str[i] == 'E') {
				if (hasE || i == str.length - 1)
					return false;
				hasE = true;
			} else if (str[i] == '.') {
				if (i == str.length - 1 || decimal || hasE)
					return false;
				decimal = true;
			} else if (str[i] == '+' || str[i] == '-') {
				if (sign && str[i - 1] != 'e' && str[i - 1] != 'E')
					return false;
				if (!sign && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E')
					return false;
				sign = true;
			} else if (str[i] < '0' || str[i] > '9') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		IsNumberic isNumberic = new IsNumberic();
		String str = "+100";
		String str1 = "5e2";
		String str2 = "-123";
		String str3 = "3.1416";
		String str4 = "-1E-16";
		
		String str5 = "12e";
		String str6 = "1a3.14";
		String str7 = "1.22.3";
		String str8 = "+-5";
		String str9 = "12e+4.2";
		
		System.out.println(" str = " + str + "    is "+isNumberic.isNumberic(str.toCharArray()));
		System.out.println(" str1 = " + str1 + "    is "+isNumberic.isNumberic(str1.toCharArray()));
		System.out.println(" str2 = " + str2 + "    is "+isNumberic.isNumberic(str2.toCharArray()));
		System.out.println(" str3 = " + str3 + "    is "+isNumberic.isNumberic(str3.toCharArray()));
		System.out.println(" str4 = " + str4 + "    is "+isNumberic.isNumberic(str4.toCharArray()));
		System.out.println(" str5 = " + str5 + "    is "+isNumberic.isNumberic(str5.toCharArray()));
		System.out.println(" str6 = " + str6 + "    is "+isNumberic.isNumberic(str6.toCharArray()));
		System.out.println(" str7 = " + str7 + "    is "+isNumberic.isNumberic(str7.toCharArray()));
		System.out.println(" str8 = " + str8 + "    is "+isNumberic.isNumberic(str8.toCharArray()));
		System.out.println(" str9 = " + str9 + "    is "+isNumberic.isNumberic(str9.toCharArray()));
	}
}
