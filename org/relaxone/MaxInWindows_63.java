package org.relaxone;

import java.util.ArrayList;

/**
 * a. 求滑动窗口的最大值
 * b. 循环获取每个滑动窗口的最大值
 * @author zhoucw
 *
 */
public class MaxInWindows_63 {
	public ArrayList<Integer> maxInWindows(int[] nums, int size){
		ArrayList<Integer> list = new ArrayList<>();
		if(size < 1 || size > nums.length)
			return list;
		for(int i=0;i < nums.length - size + 1 ;i++) {
			int maxValue = nums[i];
			for(int j = i+1; j< size+i;j++) {
				if(maxValue < nums[j])
					maxValue = nums[j];
			}
			list.add(maxValue);
		}
		return list;
	}
	public static void main(String[] args) {
		MaxInWindows_63 windows = new MaxInWindows_63();
		int[] nums = {2,3,4,2,6,2,5,1};
		System.out.println(windows.maxInWindows(nums, 3));
	}
}
