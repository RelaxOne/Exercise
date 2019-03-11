package org.relaxone;

/**
 * a. ԲȦ�����ʣ�µ���
 * b. (1) ������ģ�⻷
 *    (2) �õݹ鹫ʽ��f[n] = (f[n-1]+m) % i ����(i > 1)
 * @author zhoucw
 *
 */
public class LastRemaining_46 {
	/**
	 * ������ģ�⻷�ķ�ʽ
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public int lastRemaning(int n, int m) {
		if (m == 0 || n == 0)
			return -1;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++)
			temp[i] = 0;

		int i = 0; // i ��ʾÿ��ѭ�����±�
		int index = 0;// index ��ʾ�����ֻص��±�
		int t = 0; // t ��ʾ�Ѿ���ȥ�ĸ���
		while (t < n - 1) {
			if (temp[index] != -1) {
				if (i == m - 1) {
					System.out.println(index + " ����...");
					t++;
					temp[index] = -1;
					i = 0;
				} else {
					i++;
				}
			}
			index++;
			if (index == n)
				index = 0;
		}
		for (int q = 0; q < temp.length; q++) {
			if (temp[q] == 0)
				return q;
		}
		return 0;
	}

	/**
	 * �õݹ鹫ʽ��f[n] = (f[n-1]+m) % i ����(i > 1)
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public int lastRemaning_2(int n, int m) {
		if (m == 0 || n == 0)
			return -1;
		int s = 0;
		for (int i = 2; i <= n; i++)
			s = (s + m) % i;
		return s;
	}

	public static void main(String[] args) {
		LastRemaining_46 lastRemaining_46 = new LastRemaining_46();
		System.out.println(lastRemaining_46.lastRemaning_2(5, 3));
	}
}
