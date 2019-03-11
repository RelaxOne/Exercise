package org.relaxone;

import java.util.Stack;
import com.relaxone.common.ListNode;

/**
 * a. ��תһ������
 * b. ���������һ��ջ�У�ѭ����ջ���õ��µ����� 
 * @author zhoucw
 *
 */
public class ReverseList_15 {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return head;
		Stack<ListNode> stack = new Stack<>();
		ListNode p = head;
		while (p != null) {
			stack.push(p);
			p = p.next;
		}
		ListNode result = stack.pop();
		result.next = null;
		p = result;
		while (!stack.isEmpty()) {
			ListNode node = stack.pop();
			node.next = p.next;
			p.next = node;
			p = p.next;
		}
		return result;
	}
}
