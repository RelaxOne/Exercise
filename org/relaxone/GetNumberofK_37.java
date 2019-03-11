package org.relaxone;

/**
 * a. ���������������г��ֵĴ���
 * b. (1) �������� 
 *    (2) ������С�ڸ���ֵ��ʼ�����������ڸ���ֵ����
 * 
 * @author zhoucw
 *
 */
public class GetNumberofK_37 {
	/**
	 * ֱ�ӱ�������
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int getNumberofK(int[] array, int k) {
		int number = 0, index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != k) {
				if (i - index > 1)
					return number;
				index = i;
				continue;
			}
			number++;
		}
		return number;
	}

	/**
	 * �û������ڵķ��������������������г��ֵĴ���
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int getNumberofK_2(int[] array, int k) {
		if (array == null)
			return 0;
		int start = 0, end = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == k) {
				if (i == array.length - 1) {
					end = array.length;
				} else if (array[i + 1] > array[i]) {
					end = i + 1;
					break;
				}
				if (array[i - 1] < array[i]) {
					start = i;
				}
			}
		}
		if (array[0] == k)
			return end - start + 1;
		else
			return end - start;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 3 };
		GetNumberofK_37 numberofK_37 = new GetNumberofK_37();
		System.out.println(numberofK_37.getNumberofK(array, 3));
		System.out.println(numberofK_37.getNumberofK_2(array, 3));
	}
}
