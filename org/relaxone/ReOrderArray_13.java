package org.relaxone;

import java.util.ArrayList;

/**
 * a. 将奇数和偶数分离并保持其相对位置不变
 * b. 用两个数组分别存储奇数和偶数
 * @author zhoucw
 *
 */
public class ReOrderArray_13 {

	public void reOrderArray(int[] array) {
		ArrayList<Integer> o = new ArrayList<>();
		ArrayList<Integer> d = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				o.add(array[i]);
			else
				d.add(array[i]);
		}
		for (int i = 0; i < o.size(); i++) {
			array[i] = o.get(i).intValue();
		}
		for (int i = 0; i < d.size(); i++)
			array[i + o.size()] = d.get(i).intValue();
	}

	public static void main(String[] args) {
		ReOrderArray_13 array_13 = new ReOrderArray_13();
		int[] array = { 3, 4, 5, 1, 2 };
		array_13.reOrderArray(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
