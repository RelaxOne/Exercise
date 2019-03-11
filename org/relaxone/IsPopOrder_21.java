package org.relaxone;

import java.util.Stack;

/**
 * a. 判断一个序列是否可能是出栈序列
 * b. 将入栈序列循环入栈，在入栈过程中比较当前栈顶元素是否和出栈序列相等，最后判断栈是否为空
 * 
 * @author zhoucw
 *
 */
public class IsPopOrder_21 {

	public static boolean isPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0 || pushA == null || popA == null || pushA.length != popA.length)
			return false;
		int popIndex = 0;
		Stack<Integer> tempStack = new Stack<>();
		for (int i = 0; i < popA.length; i++) {
			tempStack.push(Integer.valueOf(pushA[i]));
			while (!tempStack.isEmpty() && tempStack.peek() == popA[popIndex]) {
				popIndex++;
				tempStack.pop();
			}
		}
		return tempStack.empty();
	}

	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 5, 3, 2, 1 };
		System.out.println(isPopOrder(pushA, popA));
	}
}
