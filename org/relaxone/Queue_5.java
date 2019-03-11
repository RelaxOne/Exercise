package org.relaxone;

import java.util.Stack;

/**
 * a. ������ջʵ�ֶ��е���Ӻͳ��Ӳ���
 * b. stack1 �����洢Ԫ��ֵ�����г��ӵĲ���ʱ������ջ����ʵ��������ջ
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
		// �� stack1 �е�����ȫ��ѹ�� stack2 ��
		while(!stack1.isEmpty())
			stack2.push(stack1.pop());
		// ��� stack ջ��Ԫ��
		int first = stack2.pop();
		// �� stack2 �е�Ԫ��ȫ��ѹ�� stack1 ��
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
