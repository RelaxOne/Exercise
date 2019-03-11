package org.relaxone;

/**
 * a. 不能用乘除法及循环等关键字和判断条件求 1+2+3+...+n
 * b. (1) 利用 Math.pow() 方法计算 n* (n+1)， 再利用 >> 移位做除法
 *    (2) 用递归循环计算 
 * @author zhoucw
 *
 */
public class Sum_47 {
	
	/**
	 * 利用 Math.pow() 方法计算 n* (n+1)， 再利用 >> 移位做除法
	 * @param n
	 * @return
	 */
	public int sum(int n) {
		int sum = (int) (Math.pow(n, 2)+n);
		return sum >> 1;
	}
	
	/**
	 * 用递归循环计算 
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
