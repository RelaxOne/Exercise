package org.relaxone;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * a. ��ӡһ���ַ������ַ���ȫ����
 * b. �̶�һ�����ַ���������������ַ������е����������ַ�
 * @author zhoucw
 *
 */
public class Permutation_27 {
	public ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<>();
		if (str.length() == 0 || str.trim() == "") {
			return result;
		}

		char[] chars = str.toCharArray();
		TreeSet<String> list = new TreeSet<>();

		permutation(chars, 0, list);
		result.addAll(list);
		return result;
	}

	public void permutation(char[] chars, int begin, TreeSet<String> list) {
		if (chars.length == 0 || chars == null || begin < 0 || begin > chars.length - 1)
			return;
		if (begin == chars.length-1) {
			list.add(String.valueOf(chars));
		} else {
			for (int i = begin; i < chars.length; i++) {
				// ���������е�����Ԫ��
				swap(chars, begin, i);
				permutation(chars, begin + 1, list);
				// ��������Ԫ�ػ�����
				swap(chars, begin , i);
			}
		}

	}
	/**
	 * �����ַ������������ַ�
	 * @param chars
	 * @param begin
	 * @param i
	 */
	public void swap(char[] chars, int begin, int i) {
		char temp = chars[begin];
		chars[begin] = chars[i];
		chars[i] = temp;
	}
	
	public static void main(String[] args) {
		Permutation_27 permutation = new Permutation_27();
		String str ="ab";
		System.out.println(permutation.permutation(str));
	}
}
