package org.relaxone;

import java.util.ArrayList;

/**
 * a. 求数组中只出现一次的数字(仅两个只出现一次，其他的都出现偶数次)
 * b. (1) 遍历数组，将值在集合中不存在则将值添加到辅助集合中，若集合中存在，则将其移除
 * 	  (2) 利用分组求亦或得到两个数字
 * @author zhoucw
 *
 */
public class FindNumberAppearOnce_40 {
	
	/**
	 * 利用辅助集合实现查找数组中只出现一次的数字
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
	 * 利用分组求亦或得到两个数字
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
		// 异或后的数1出现在第几位
		int indexOf1 = 0;
		while (((arrXor & 1) == 0) && indexOf1 <= 32) {
			arrXor = arrXor >>> 1;
			indexOf1++;
		}
		for (int i : array) {
			boolean isBit1 = ((i >>> indexOf1) & 1) == 0;
			// 根据第k位是1还是0来分组
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
