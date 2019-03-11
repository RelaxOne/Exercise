package org.relaxone;

/**
 * a. 求数组中第一个出现的重复数字,数组范围 [0,n], 数组数字范围也是 [0, n]
 * b. (1) 双层循环，第二层获取到的数字和它前面的所有数字作比较，相等则返回
 * 	  (2) 利用 n 维的boolean 数组，遍历到下标为 i 时，判断其值是否为 true, 若为 true, 则返回该下标,否则将其值置为 true
 * @author zhoucw
 *
 */
public class Duplicate_50 {

	/**
	 * 双层循环，第二层获取到的数字和它前面的所有数字作比较，相等则返回
	 * @param numbers
	 * @param length
	 * @param duplication
	 * @return
	 */
	public boolean duplicate(int[] numbers, int length, int[] duplication) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i]) {
					duplication[0] = numbers[j];
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 利用 n 维的boolean 数组，遍历到下标为 i 时，判断其值是否为 true, 若为 true, 则返回该下标,否则将其值置为 true
	 * @param numbers
	 * @param length
	 * @param duplication
	 * @return
	 */
	public boolean duplicate_2(int numbers[], int length, int[] duplication) {
		boolean[] temp = new boolean[length];
		for(int i = 0;i<length;i++) {
			if(temp[numbers[i]] == true) {
				duplication[0] = numbers[i];
				return true;
			}else {
				temp[numbers[i]] = true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,3,1,0,2,5,3};
		int length = numbers.length;
		int[] duplication = new int[1];
		Duplicate_50 duplicate = new Duplicate_50();
		duplicate.duplicate_2(numbers, length, duplication);
		System.out.println(duplication[0]);
	}
}	
