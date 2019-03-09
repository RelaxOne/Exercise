package org.relaxone;

import java.util.ArrayList;

public class PrintMatrix {
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
