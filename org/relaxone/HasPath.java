package org.relaxone;

public class HasPath {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
		boolean[] flag = new boolean[matrix.length];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (judge(matrix, rows, cols, i, j, 0, flag, str))
					return true;
			}
		}
		return false;
	}

	public boolean judge(char[] matrix, int rows, int cols, int i, int j, int k, boolean[] flag, char[] str) {
		int index = i * cols + j;
		if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || flag[index] == true)
			return false;
		if(k == str.length-1)
			return true;
		flag[index] = true;
		if( judge(matrix, rows, cols, i+1, j, k+1, flag, str)||
			judge(matrix, rows, cols, i-1, j, k+1, flag, str)||
			judge(matrix, rows, cols, i, j-1, k+1, flag, str)||
			judge(matrix, rows, cols, i, j+1, k+1, flag, str)
			)
			return true;
			
		flag[index] = false;
		return false;
	}
	public static void main(String[] args) {
		HasPath hasPath = new HasPath();
		char[] matrix ="ABCESFCSADEE".toCharArray();
		char[] str = "ABCCED".toCharArray();
		System.out.println(hasPath.hasPath(matrix, 3, 4, str));
	}
	
}
