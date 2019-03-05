package org.relaxone;

import java.util.HashMap;

public class FirstNotRepeatChar {
	public static int firstNotReoeatChar(String str) {
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
		System.out.println(firstNotReoeatChar(str));
	}
}
