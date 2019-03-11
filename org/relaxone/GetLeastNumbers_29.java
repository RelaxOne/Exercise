package org.relaxone;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * a. 获取数字中最小的 k个元素
 * b. 利用 Arrays.sort() 先将数组进行排序，然后获取前面 k 个元素
 * @author zhoucw
 *
 */
public class GetLeastNumbers_29 {

	public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		if (input == null || input.length == 0 || k > input.length)
			return result;
		Arrays.sort(input);
		for (int i = 0; i < k; i++)
			result.add(input[i]);
		return result;
	}

}
