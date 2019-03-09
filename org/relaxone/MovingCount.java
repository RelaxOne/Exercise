package org.relaxone;

public class MovingCount {
	public int movingCount(int threshold, int rows, int cols) {
		boolean[][] visited = new boolean[rows][cols];
		return countingStep(threshold, rows, cols, 0, 0, visited);
	}

	public int countingStep(int threshold, int rows, int cols, int i, int j, boolean[][] visited) {
		if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] || (getNumbeSum(j) + getNumbeSum(i)) > threshold)
			return 0;
		visited[i][j] = true;
		return countingStep(threshold, rows, cols, i + 1, j, visited)
				+ countingStep(threshold, rows, cols, i - 1, j, visited)
				+ countingStep(threshold, rows, cols, i, j + 1, visited)
				+ countingStep(threshold, rows, cols, i, j - 1, visited) + 1;
	}

	public int getNumbeSum(int num) {
		char[] strs = String.valueOf(num).toCharArray();
		int sum = 0;
		for (int i = 0; i < strs.length; i++) {
			sum += Integer.parseInt(String.valueOf(strs[i]));
		}
		return sum;
	}

	public static void main(String[] args) {
		MovingCount count = new MovingCount();
		System.out.println(count.movingCount(10, 1, 100));
	}
}
