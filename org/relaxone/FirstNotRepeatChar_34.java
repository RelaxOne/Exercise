package org.relaxone;

import java.util.HashMap;

/**
 * a. 获取字符串中第一个只出现一次的字符
 * b. 统计字符串中字符出现的次数并将次数放入到 hashMap 中，最后获取 hashmap 中第一个值为1 的字符的位置
 *    即为第一个只出现一次的字符在字符串中的位置
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
