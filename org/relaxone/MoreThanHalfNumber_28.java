package org.relaxone;

import java.util.HashMap;

/**
 * a. 找出数组中出现超过一半的数字，不存在返回 0 
 * b. 用一个 hashmap 存储每个数字出现的 次数，当次数大于数组长度的一半时返回该数字
 * @author zhoucw
 *
 */
public class MoreThanHalfNumber_28 {
	public int moreThanHalfNumber(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<>();
		if (array == null || array.length == 0)
			return 0;
		if (array.length == 1)
			return array[0];
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			if (map.containsKey(number)) {
				int value = map.get(number).intValue();
				map.replace(number, value + 1);
				if (map.get(number) > array.length / 2)
					return number;
			} else {
				map.put(number, 1);
			}
		}
		return 0;
	}
}
