package org.relaxone;

import java.util.ArrayList;
import java.util.TreeSet;

public class Permutation {
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

	public void swap(char[] chars, int begin, int i) {
		char temp = chars[begin];
		chars[begin] = chars[i];
		chars[i] = temp;
	}
	
	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		String str ="ab";
		System.out.println(permutation.permutation(str));
	}
}
