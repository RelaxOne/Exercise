package org.relaxone;

import java.util.HashMap;

/**
 * a. ��ȡ�ַ����е�һ��ֻ����һ�ε��ַ�
 * b. ͳ���ַ������ַ����ֵĴ��������������뵽 hashMap �У�����ȡ hashmap �е�һ��ֵΪ1 ���ַ���λ��
 *    ��Ϊ��һ��ֻ����һ�ε��ַ����ַ����е�λ��
 * @author zhoucw
 *
 */
public class FirstNotRepeatChar_34 {
	public int firstNotReoeatChar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i < str.length();i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				int intValue = map.get(c).intValue() + 1;
				map.put(c, intValue);
			}else {
				map.put(c, 1);
			}
		}
		for(int i = 0; i < str.length(); i++) {
			if(map.get(str.charAt(i)) == 1)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
		FirstNotRepeatChar_34 char_34 = new FirstNotRepeatChar_34();
		System.out.println(char_34.firstNotReoeatChar(str));
	}
}
