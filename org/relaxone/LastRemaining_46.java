package org.relaxone;

/**
 * a. 圆圈中最后剩下的数
 * b. (1) 用数组模拟环
 *    (2) 用递归公式：f[n] = (f[n-1]+m) % i 其中(i > 1)
 * @author zhoucw
 *
 */
public class LastRemaining_46 {
	/**
	 * 用数组模拟环的方式
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

		int i = 0; // i 表示每次循环的下标
		int index = 0;// index 表示环形轮回的下标
		int t = 0; // t 表示已经出去的个数
		while (t < n - 1) {
			if (temp[index] != -1) {
				if (i == m - 1) {
					System.out.println(index + " 出列...");
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
	 * 用递归公式：f[n] = (f[n-1]+m) % i 其中(i > 1)
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
