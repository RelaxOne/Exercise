package org.relaxone;

public class LastRemaining {
	public static int lastRemaning(int n, int m) {
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

	public static int method_2(int n, int m) {
		if (m == 0 || n == 0) 
			return -1;
		int s = 0;
		for (int i = 2; i <= n; i++)
			s = (s + m) % i;
		return s;
	}

	public static void main(String[] args) {
		System.out.println(method_2(5, 3));
	}
}
