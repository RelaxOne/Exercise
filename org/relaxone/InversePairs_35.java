package org.relaxone;

/**
 * a. 求数组中的逆序对
 * b. 用归并排序的方法在排序过程中统计逆序对的个数
 * @author zhoucw
 *
 */
public class InversePairs_35 {

	public int inversepairs(int[] array) {
		int[] result = new int[1];
		if (array != null)
			mergeSortUp2Down(array, 0, array.length - 1, result);
		return result[0];
	}

	/*
	 * 归并排序(从上往下)
	 */
	public void mergeSortUp2Down(int[] a, int start, int end, int[] result) {
		if (start >= end)
			return;
		int mid = (start + end) >> 1;

		mergeSortUp2Down(a, start, mid, result);
		mergeSortUp2Down(a, mid + 1, end, result);

		merge(a, start, mid, end, result);
	}

	public void merge(int[] a, int start, int mid, int end, int[] result) {
		int[] tmp = new int[end - start + 1];

		int i = start, j = mid + 1, k = 0;
		while (i <= mid && j <= end) {
			if (a[i] <= a[j])
				tmp[k++] = a[i++];
			else {
				tmp[k++] = a[j++];
				int cnt = result[0];
				cnt += mid - i + 1;
				if (cnt > 1000000007)
					result[0] = cnt % 1000000007;
				else
					result[0] = cnt;
			}
		}

		while (i <= mid)
			tmp[k++] = a[i++];
		while (j <= end)
			tmp[k++] = a[j++];
		for (k = 0; k < tmp.length; k++)
			a[start + k] = tmp[k];
	}

	public static void main(String[] args) {
		InversePairs_35 inversePairs = new InversePairs_35();

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0, 1 };
		System.out.println(inversePairs.inversepairs(array));
	}
}
