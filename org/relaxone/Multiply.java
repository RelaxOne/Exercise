package org.relaxone;

public class Multiply {
	public int[] multiply(int[] A) {
		int length = A.length;
		if (length == 0)
			return null;
		int[] result = new int[length];
		result[0] = 1;
		for (int i = 1; i < length; i++) {
			result[i] = result[i - 1] * A[i - 1];
		}
		int temp = 1;
		for (int i = length - 1; i > 0; i--) {
			temp *= A[i];
			result[i - 1] *= temp;
		}

		return result;
	}
}
