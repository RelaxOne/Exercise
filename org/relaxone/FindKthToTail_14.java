package org.relaxone;

import com.relaxone.common.ListNode;

/**
 * a. 寻找链表的倒数 第 K个节点
 * b. 用两个指针来遍历链表，两指针相差节点为 K
 * @author zhoucw
 *
 */
public class FindKthToTail_14 {
	public ListNode findKthToTail(ListNode head, int k) {
		ListNode p = head;
		if(p == null || k < 0)
			return null;
		int gap = 0;
		ListNode result = head;
		while(p != null) {
			if(gap >= k) {
				result = result.next;
			}
			p = p.next;
			gap++;
		}
		if(gap < k)
			return null;
		else
			return result;
	}
	
	public static void main(String[] args) {
		FindKthToTail_14 toTail_14 = new FindKthToTail_14();
		
		ListNode listNode = ListNode.init();
		ListNode.printNode(listNode);
		ListNode node = toTail_14.findKthToTail(listNode, 10);
		ListNode.printNode(node);
	}
	
}
