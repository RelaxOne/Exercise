package org.relaxone;

import java.util.ArrayList;

/**
 * a. ����������˳ʱ���˳�����δ�ӡ������
 * b. ѭ����ӡ����ĵ�һ�У���ӡ����ʱ��ת�þ���
 * @author zhoucw
 *
 */
public class PrintMatrix_19 {
	/**
	 * ����������˳ʱ���˳�����δ�ӡ������
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<>();
		int row = matrix.length;
		while (row != 0) {
			for (int i = 0; i < matrix[0].length; i++) {
				result.add(matrix[0][i]);
			}
			if (row == 1)
				break;
			matrix = turn(matrix);
			row = matrix.length;
		}
		return result;
	}
	/**
	 * ��ʱ��ת�þ��󣬲�ȥ����һ�У�����ת�ú�ľ���
	 * @param matrix
	 * @return
	 */
	public int[][] turn(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] newMatrix = new int[col][row - 1];
		for (int j = col - 1; j >= 0; j--) {
			for (int i = 1; i < row; i++) {
				newMatrix[col - j - 1][i - 1] = matrix[i][j];
			}
		}
		return newMatrix;
	}
}
