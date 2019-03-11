package org.relaxone;

/**
 * a. ��쳲��������еĵ� n ���ֵ
 * b. f(n) = f(n-1) + f(n-2) ���� f(1) = f(2) = 1
 * @author zhoucw
 *
 */
public class Fibonacci_7 {
	
	public int fibonacci(int n) {
		if(n <= 0)
			return 0;
		if(n ==1 || n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Fibonacci_7 fibonacci_7 = new Fibonacci_7();
		System.out.println(fibonacci_7.fibonacci(3));
	}
	
}
