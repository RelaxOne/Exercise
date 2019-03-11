package org.relaxone;

import java.util.Stack;

/**
 * a. �Զ���һ��ջ�����ݽṹ��Ҫ������O(1)���Ӷ�����ø�ջ����СԪ�� b.
 * b. ����һ��ջ��������һ����Сֵ������ջ��ʱ���жϸ�ֵ�Ƿ�С�ڵ�ǰ��Сֵ
 *    ��С�ڣ����滻 �ڳ�ջ��ʱ�򣬱���ջ���õ�����С��Ԫ��
 * 
 * @author zhoucw
 *
 */
public class Stack_20 {

	// �洢ջ��Ԫ��ֵ
	private Stack<Integer> stack = new Stack<>();
	// �洢��ǰջ����Сֵ
	private int min = Integer.MAX_VALUE;

	// ��һ��Ԫ��ѹ��ջ��
	public void push(int node) {
		stack.push(node);
		if (node < min)
			min = node;
	}

	// ����ջ��Ԫ��
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

	// ��ȡջ��Ԫ��ֵ
	public int top() {
		return stack.peek();
	}

	// ��ȡջ����С��Ԫ��ֵ
	public int min() {
		return min;
	}
}
