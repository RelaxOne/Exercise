package org.relaxone;

public class InversePairs {
	public static int inversepairs(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i])
					result++;
			}
		}
		return result % 1000000007;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		System.out.println(inversepairs(array));
	}
}
