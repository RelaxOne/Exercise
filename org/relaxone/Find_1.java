package org.relaxone;

/**
 * a. 在给定生序的二维数组中找到是否存在给定的值
 * b. 从坐下角或者右上角开始查找, 将二维数组变成都是生序或者降序的数列
 * @param target
 * @param array
 * @return
 */
public class Find_1 {
	public boolean find(int target, int[][] array) {
		if(array.length == 0)
			return false;
		// 选取左下角作为开始节点
		int row = array.length - 1, col = 0;
		while(row>=0 && col< array[0].length) {
			if(array[row][col] == target)
				return true;
			// 当前节点值小于给定值,则向右移动
			else if(target > array[row][col]) 
				col++;
			// 当前节点大于给定值, 则向上移动
			else
				row--;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Find_1 find_1 = new Find_1();
		int[][] array = {{1,3,5},{2,4,7},{4,6,8}};
		System.out.println(find_1.find(8, array ));
	}
}
