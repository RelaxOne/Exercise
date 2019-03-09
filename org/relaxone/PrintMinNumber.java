package org.relaxone;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {

	public String printMinNumber(int[] numbers) {
		if (numbers.length == 0 || numbers == null)
			return null;
		String[] strs = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			strs[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				return (o1 + o2).compareTo(o2 + o1);
			}
		});

		StringBuffer buffer = new StringBuffer();
		for (String str : strs)
			buffer.append(str);

		return buffer.toString();
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 32, 321 };
		PrintMinNumber minNumber = new PrintMinNumber();
		System.out.println(minNumber.printMinNumber(numbers));
	}

}
