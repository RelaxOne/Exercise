package org.relaxone;

import java.util.ArrayList;

/**
 * a. 求和为 sum 的连续整数序列
 * b. 利用滑动窗口的方法求其值，若当前滑动窗口和小于 sum 则右边界向右移动，否则左边界向右移动
 * @author zhoucw
 *
 */
public class FindContnuousSequence_41 {

	public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int low = 1, high = 2;
		while (low < high) {
			int tem = (low + high) * (high - low + 1) / 2;
			if (tem == sum) {
				ArrayList<Integer> list = new ArrayList<>();
				int index = low;
				while (index <= high) {
					list.add(index);
					index++;
				}
				result.add(list);
				low++;
			}else if(tem > sum) {
				low++;
			}else {
				high++;
			}
		}

		return result;
	}
	public static void main(String[] args) {
		FindContnuousSequence_41 sequence = new FindContnuousSequence_41();
		System.out.println(sequence.findContinuousSequence(100));
	}
}
