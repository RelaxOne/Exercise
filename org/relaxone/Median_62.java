package org.relaxone;

import java.util.ArrayList;
import java.util.Collections;

/**
 * a. 获取数据流的中位数
 * b. 数组存储数据流中的元素，并求其中位数
 * @author zhoucw
 *
 */
public class Median_62 {

	ArrayList<Integer> array = new ArrayList<>();

	public void Insert(Integer num) {
		array.add(num);
	}

	public Double getMedian() {
		Collections.sort(array);

		int length = array.size();
		int pos = length / 2;

		if (length % 2 == 1)
			return 1.0 * array.get(pos);
		else
			return (array.get(pos) + array.get(pos-1)) / 2.0;
	}
	
	public static void main(String[] args) {
		Median_62 median = new Median_62();
		Integer[] nums = {5,2,3,4,1,6,7,0,8};
		for(int i =0 ;i<nums.length;i++) {
			median.Insert(nums[i]);
			System.out.println(median.getMedian());
		}
	}

}
