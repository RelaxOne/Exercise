package org.relaxone;

/**
 * a. 反转句子
 * b. 按空格对字符串进行分组，从后到前拼接字符串数组
 * @author zhoucw
 *
 */
public class ReverseSentence_44 {
	public String reverseSentence(String str) {

		String result = "";
		if (str == null) {
			return null;
		}
		if (str.trim().equals("")) {
			return str;
		}
		String[] list = str.split(" ");
		if (list.length == 0)
			return " ";
		for (int i = list.length - 1; i > 0; i--) {
			result += list[i] + " ";
		}
		result += list[0];

		return result;
	}

	public static void main(String[] args) {
		String str = " ";
		ReverseSentence_44 sentence_44 = new ReverseSentence_44();
		System.out.println(sentence_44.reverseSentence(str));
	}
}
