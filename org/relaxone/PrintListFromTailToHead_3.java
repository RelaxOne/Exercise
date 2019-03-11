package org.relaxone;

import java.util.ArrayList;
import java.util.Stack;

import com.relaxone.common.ListNode;

/**
 * a. ������β������ͷ���ֵ�������У������ظü���
 * b. ����һ��ջ��ʱ�洢���ݣ����γ�ջ��������
 * @param listNode
 * @return
 */
public class PrintListFromTailToHead_3 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> result = new ArrayList<>();
		Stack<Integer> values = new Stack<>();
		if(listNode == null)
			return result;
		ListNode p = listNode;
		while(p != null) {
			values.add(p.val);
			p = p.next;
		}
		while(!values.isEmpty()) {
			result.add(values.pop());
		}
		return result;
	}
	
	public static void main(String[] args) {
		PrintListFromTailToHead_3 head_3 = new PrintListFromTailToHead_3();
		ListNode  root  = ListNode.init();
		System.out.println(head_3.printListFromTailToHead(root));
	}
}
