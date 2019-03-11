package org.relaxone;

import java.util.ArrayList;

/**
 * a. 求递增数组中和为 sum 的两个数，存在多组时选取乘积较小的一组
 * b. 利用滑动窗口的方法，一个从头开始，一个从尾开始，
 *    若和大于 sum, 则尾部向左移动一格，否则头部向右移动一格，找到即返回
 * @author zhoucw
 *
 */
public class FindNumbersWithSum_42 {

	public ArrayList<Integer> FindNumberWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0, j = array.length - 1;
		while (i<j) {
			if(array[i] + array[j] == sum) {
				list.add(Integer.valueOf(array[i]));
				list.add(Integer.valueOf(array[j]));
				return list;
			}
			if(array[i] + array[j] < sum) {
				i++;
			}else {
				j--;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		int[] array = {1,2,5,6,9,12,15,20};
		FindNumbersWithSum_42 withSum_42 = new FindNumbersWithSum_42();
		System.out.println(withSum_42.FindNumberWithSum(array, 18));
	}
}
