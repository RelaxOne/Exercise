package org.relaxone;

/**
 * a. ��ȡһ�������������������ֵ
 * b. �û�������������ֵ
 * @author zhoucw
 *
 */
public class FindGreatestSumOfSubArray_30 {
	public int findGreatestSumOfSubArray(int[] array) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += array[k];
				}
				if (sum > result)
					result = sum;
			}
		}

		return result;
	}
}