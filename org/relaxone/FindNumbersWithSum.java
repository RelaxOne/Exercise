package org.relaxone;

import java.util.ArrayList;

public class FindNumbersWithSum {

	public static ArrayList<Integer> FindNumberWithSum(int[] array, int sum) {
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
		System.out.println(FindNumberWithSum(array, 18));
	}
}
