package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.ListNode;

/**
 * a. ��������ĵ�һ�������ڵ�
 * b. ��һ��������뵽�����У���������һ�������жϼ������Ƿ��иýڵ�
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