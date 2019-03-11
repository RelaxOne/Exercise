package org.relaxone;

/**
 * a. �ڸ�������Ķ�ά�������ҵ��Ƿ���ڸ�����ֵ
 * b. �����½ǻ������Ͻǿ�ʼ����, ����ά�����ɶ���������߽��������
 * @param target
 * @param array
 * @return
 */
public class Find_1 {
	public boolean find(int target, int[][] array) {
		if(array.length == 0)
			return false;
		// ѡȡ���½���Ϊ��ʼ�ڵ�
		int row = array.length - 1, col = 0;
		while(row>=0 && col< array[0].length) {
			if(array[row][col] == target)
				return true;
			// ��ǰ�ڵ�ֵС�ڸ���ֵ,�������ƶ�
			else if(target > array[row][col]) 
				col++;
			// ��ǰ�ڵ���ڸ���ֵ, �������ƶ�
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
