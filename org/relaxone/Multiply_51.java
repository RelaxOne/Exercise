package org.relaxone;

/**
 * a. 构建乘积数组
 * b. 利用矩阵中上三角和下三角的乘法
 * @author zhoucw
 *
 */
public class Multiply_51 {
	public int[] multiply(int[] A) {
		int length = A.length;
		if (length == 0)
			return null;
		int[] result = new int[length];
		result[0] = 1;
		// 计算下三角
		for (int i = 1; i < length; i++) {
			result[i] = result[i - 1] * A[i - 1];
		}
		int temp = 1;
		// 计算上三角
		for (int i = length - 1; i > 0; i--) {
			temp *= A[i];
			result[i - 1] *= temp;
		}

		return result;
	}
}
