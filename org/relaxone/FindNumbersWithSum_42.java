package org.relaxone;

import java.util.ArrayList;

/**
 * a. ����������к�Ϊ sum �������������ڶ���ʱѡȡ�˻���С��һ��
 * b. ���û������ڵķ�����һ����ͷ��ʼ��һ����β��ʼ��
 *    ���ʹ��� sum, ��β�������ƶ�һ�񣬷���ͷ�������ƶ�һ���ҵ�������
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
