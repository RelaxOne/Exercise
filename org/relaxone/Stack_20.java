package org.relaxone;

import java.util.Stack;

/**
 * a. 自定义一个栈的数据结构，要求能在O(1)复杂度下求得该栈的最小元素 b.
 * b. 定义一个栈，并定义一个最小值，当入栈的时候，判断该值是否小于当前最小值
 *    若小于，则替换 在出栈的时候，遍历栈，得到其最小的元素
 * 
 * @author zhoucw
 *
 */
public class Stack_20 {

	// 存储栈内元素值
	private Stack<Integer> stack = new Stack<>();
	// 存储当前栈中最小值
	private int min = Integer.MAX_VALUE;

	// 将一个元素压入栈中
	public void push(int node) {
		stack.push(node);
		if (node < min)
			min = node;
	}

	// 弹出栈顶元素
	public void pop() {
		stack.pop();
		min = Integer.MAX_VALUE;
		Stack<Integer> tempStack = new Stack<>();
		while (!stack.isEmpty()) {
			int temp = stack.pop().intValue();
			if (temp < min)
				min = temp;
			tempStack.push(temp);
		}
		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}
	}

	// 获取栈顶元素值
	public int top() {
		return stack.peek();
	}

	// 获取栈内最小的元素值
	public int min() {
		return min;
	}
}
