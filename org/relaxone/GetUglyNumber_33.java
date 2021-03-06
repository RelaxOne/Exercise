package org.relaxone;

/**
 * a. 获取第 n 个丑数
 * b. 从丑数开始分别乘以 2,3,5 获取最小的那个
 * @author zhoucw
 *
 */
public class GetUglyNumber_33 {

	public int getUglyNumber(int index) {
		if (index < 1)
			return 0;
		int[] result = new int[index];
		int i = 1;
		result[0] = 1;
		int i2 = 0, i3 = 0, i5 = 0;
		while (i < index) {
			int temp = Math.min(result[i2] * 2, Math.min(result[i3] * 3, result[i5] * 5));
			if (temp == result[i2] * 2)
				i2++;
			if (temp == result[i3] * 3)
				i3++;
			if (temp == result[i5] * 5)
				i5++;
			result[i++] = temp;
		}

		return result[index - 1];
	}

}
