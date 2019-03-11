package org.relaxone;

import java.util.Stack;
import com.relaxone.common.ListNode;

/**
 * a. 反转一个链表
 * b. 将链表放在一个栈中，循环出栈，得到新的链表 
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
