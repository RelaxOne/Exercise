package org.relaxone;

import java.util.Arrays;

/**
 * a. �˿���˳��(���� 4 �����)
 * b. ͳ����������������������֮������ܵļ�����Ƚ����ߴ�С
 * @author zhoucw
 *
 */
public class ISContinuous_45 {

	public boolean isContinuous(int[] numbers) {
		if (numbers.length == 0 || numbers == null)
			return false;
		Arrays.sort(numbers);

		int zero = 0; // ��ӵ�����
		int gap = 0; // ���ּ������
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == 0) {
				zero++;
				continue;
			}
			if (numbers[i] == numbers[i + 1])
				return false;
			gap += numbers[i + 1] - numbers[i] - 1;
		}
		if (gap > zero)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		ISContinuous_45 continuous = new ISContinuous_45();
		int[] numbers = { 1, 3, 2, 6, 4 };

		System.out.println(continuous.isContinuous(numbers));
	}
}
