package org.relaxone;
/**
 * a. 获取一个旋转数组中的最小值
 * b. 第一个递减的数即为最小元素值
 * @author zhoucw
 *
 */
public class MinNumberInRotateArray_6 {
	public int minNumberInTotateArray(int[] array) {
		if(array.length == 0)
			return 0;
		int result = array[0];
		for(int i = 1;i<array.length;i++) {
			if(array[i-1] > array[i]) {
				result = array[i];
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		MinNumberInRotateArray_6 array_6 = new MinNumberInRotateArray_6();
		int[] array = {3,4,5,1,2};
		System.out.println(array_6.minNumberInTotateArray(array));
	}
}
