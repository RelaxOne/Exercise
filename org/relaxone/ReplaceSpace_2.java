package org.relaxone;

public class ReplaceSpace_2 {
	/**
	 * a. 将字符串中的空格替换成 %20
	 * @param str
	 * @return
	 */
	public String replaceSpace(StringBuffer str) {
		StringBuffer result = new StringBuffer();
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i)==' ') {
				result.append("%20");
			}else {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		ReplaceSpace_2 replaceSpace_2 = new ReplaceSpace_2();
		StringBuffer str = new StringBuffer("Hello world, hello onece...");
		System.out.println(replaceSpace_2.replaceSpace(str));
	}
}
