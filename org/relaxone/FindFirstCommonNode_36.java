package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.ListNode;

/**
 * a. 两个链表的第一个公共节点
 * b. 将一个链表加入到集合中，遍历另外一个链表判断集合中是否含有该节点
 * @author zhoucw
 *
 */
public class FindFirstCommonNode_36 {
	public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode node1 = pHead1;
		ListNode node2 = pHead2;

		ArrayList<ListNode> listNodes = new ArrayList<>();

		while (node1 != null) {
			listNodes.add(node1);
			node1 = node1.next;
		}

		while (node2 != null) {
			ListNode temp = node2;
			if (listNodes.contains(temp)) {
				return temp;
			}
			node2 = node2.next;
		}

		return null;
	}
}