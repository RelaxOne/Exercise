package org.relaxone;

/**
 * a. �������е�һ�����ֵ��ظ�����,���鷶Χ [0,n], �������ַ�ΧҲ�� [0, n]
 * b. (1) ˫��ѭ�����ڶ����ȡ�������ֺ���ǰ��������������Ƚϣ�����򷵻�
 * 	  (2) ���� n ά��boolean ���飬�������±�Ϊ i ʱ���ж���ֵ�Ƿ�Ϊ true, ��Ϊ true, �򷵻ظ��±�,������ֵ��Ϊ true
 * @author zhoucw
 *
 */
public class Duplicate_50 {

	/**
	 * ˫��ѭ�����ڶ����ȡ�������ֺ���ǰ��������������Ƚϣ�����򷵻�
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
	 * ���� n ά��boolean ���飬�������±�Ϊ i ʱ���ж���ֵ�Ƿ�Ϊ true, ��Ϊ true, �򷵻ظ��±�,������ֵ��Ϊ true
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
