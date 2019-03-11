package org.relaxone;

/**
 * a. �����ó˳�����ѭ���ȹؼ��ֺ��ж������� 1+2+3+...+n
 * b. (1) ���� Math.pow() �������� n* (n+1)�� ������ >> ��λ������
 *    (2) �õݹ�ѭ������ 
 * @author zhoucw
 *
 */
public class Sum_47 {
	
	/**
	 * ���� Math.pow() �������� n* (n+1)�� ������ >> ��λ������
	 * @param n
	 * @return
	 */
	public int sum(int n) {
		int sum = (int) (Math.pow(n, 2)+n);
		return sum >> 1;
	}
	
	/**
	 * �õݹ�ѭ������ 
	 * @param n
	 * @return
	 */
	public int sum_2(int n) {
		int sum = n;
		if(sum == 0)
			return 0;
		sum += sum_2(n-1);
		return sum;
	}
	
	public static void main(String[] args) {
		Sum_47 sum_47 = new Sum_47();
		System.out.println(sum_47.sum_2(2));
	}
}
