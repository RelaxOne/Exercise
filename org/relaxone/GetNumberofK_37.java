package org.relaxone;

/**
 * a. 数字在排序数组中出现的次数
 * b. (1) 遍历数组 
 *    (2) 从数组小于给定值开始计数，到大于给定值结束
 * 
 * @author zhoucw
 *
 */
public class GetNumberofK_37 {
	/**
	 * 直接遍历数组
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int getNumberofK(int[] array, int k) {
		int number = 0, index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != k) {
				if (i - index > 1)
					return number;
				index = i;
				continue;
			}
			number++;
		}
		return number;
	}

	/**
	 * 用滑动窗口的方法求数字在排序数组中出现的次数
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int getNumberofK_2(int[] array, int k) {
		if (array == null)
			return 0;
		int start = 0, end = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == k) {
				if (i == array.length - 1) {
					end = array.length;
				} else if (array[i + 1] > array[i]) {
					end = i + 1;
					break;
				}
				if (array[i - 1] < array[i]) {
					start = i;
				}
			}
		}
		if (array[0] == k)
			return end - start + 1;
		else
			return end - start;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 3 };
		GetNumberofK_37 numberofK_37 = new GetNumberofK_37();
		System.out.println(numberofK_37.getNumberofK(array, 3));
		System.out.println(numberofK_37.getNumberofK_2(array, 3));
	}
}
