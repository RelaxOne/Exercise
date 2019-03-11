package org.relaxone;

/**
 * a. ��ת����
 * b. ���ո���ַ������з��飬�Ӻ�ǰƴ���ַ�������
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
