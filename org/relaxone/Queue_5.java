package org.relaxone;

import java.util.Stack;

/**
 * a. 用两个栈实现队列的入队和出队操作
 * b. stack1 用来存储元素值，当有出队的操作时，利用栈特性实现两次入栈
 * @author zhoucw
 *
 */
public class Queue_5 {
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	public void push(int node) {
		stack1.push(node);
	}
	
	public int pop() {
		// 将 stack1 中的数据全部压入 stack2 中
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		// 获得 stack 栈顶元素
		int first = stack2.pop();
		// 将 stack2 中的元素全部压入 stack1 中
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return first;
	}
	
	public static void main(String[] args) {
		Queue_5 queue_5 = new Queue_5();
		queue_5.push(3);
		queue_5.push(5);
		System.out.println(queue_5.pop());
		System.out.println(queue_5.pop());
	}
}
