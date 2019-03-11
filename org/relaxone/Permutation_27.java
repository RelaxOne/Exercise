package org.relaxone;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * a. 打印一个字符串中字符的全排列
 * b. 固定一部分字符串，交换后面的字符数组中的任意两个字符
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
				// 交换数组中的两个元素
				swap(chars, begin, i);
				permutation(chars, begin + 1, list);
				// 将交换的元素换回来
				swap(chars, begin , i);
			}
		}

	}
	/**
	 * 交换字符数组中两个字符
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
