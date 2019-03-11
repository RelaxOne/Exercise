package org.relaxone;

import java.util.ArrayList;

/**
 * a. ��������ֻ����һ�ε�����(������ֻ����һ�Σ������Ķ�����ż����)
 * b. (1) �������飬��ֵ�ڼ����в�������ֵ��ӵ����������У��������д��ڣ������Ƴ�
 * 	  (2) ���÷��������õ���������
 * @author zhoucw
 *
 */
public class FindNumberAppearOnce_40 {
	
	/**
	 * ���ø�������ʵ�ֲ���������ֻ����һ�ε�����
	 * @param array
	 * @param num1
	 * @param num2
	 */
	public static void findNumberAppearOnce(int[] array, int[] num1, int[] num2) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int number : array) {
			if (list.contains(Integer.valueOf(number))) {
				list.remove(Integer.valueOf(number));
			} else {
				list.add(Integer.valueOf(number));
			}
		}
		num1[0] = list.get(0).intValue();
		num2[0] = list.get(1).intValue();
	}
	
	/**
	 * ���÷��������õ���������
	 * @param array
	 * @param num1
	 * @param num2
	 */
	public static void findNumberAppearOnce_2(int[] array, int num1[], int num2[]) {
		if (array == null || array.length < 2)
			return;
		int arrXor = 0;
		for (int i : array)
			arrXor ^= i;
		// �������1�����ڵڼ�λ
		int indexOf1 = 0;
		while (((arrXor & 1) == 0) && indexOf1 <= 32) {
			arrXor = arrXor >>> 1;
			indexOf1++;
		}
		for (int i : array) {
			boolean isBit1 = ((i >>> indexOf1) & 1) == 0;
			// ���ݵ�kλ��1����0������
			if (isBit1) {
				num1[0] ^= i;
			} else {
				num2[0] ^= i;
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 4, 3, 2, 1 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];

		findNumberAppearOnce_2(array, num1, num2);
		System.out.println(num1[0] + " " + num2[0]);
	}

}
