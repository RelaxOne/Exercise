package org.relaxone;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * a. ��ȡ��������С�� k��Ԫ��
 * b. ���� Arrays.sort() �Ƚ������������Ȼ���ȡǰ�� k ��Ԫ��
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
