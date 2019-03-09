package org.relaxone;

import java.util.ArrayList;

public class DeleteDuplication {

	public ListNode deleteDuplication(ListNode pHead) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> duplication = new ArrayList<>();
		if (pHead == null)
			return null;
		ListNode p = pHead;
		while (p != null) {
			if (list.contains(p.val)) {
				duplication.add(p.val);
			}else {
				list.add(p.val);
			}
			p = p.next;
		}
		System.out.println(duplication);

		ListNode temp = pHead, head = null, result = null;
		// 找到第一个不重复的节点作为头结点
		while (temp != null) {
			if (duplication.contains(temp.val)) {
				temp = temp.next;
				continue;
			}
			result = temp;
			head = temp;
			temp = temp.next;
			break;
		}
		while (temp != null) {
			if (duplication.contains(temp.val)) {
				head.next = temp.next;
				temp.next = null;
				temp = head.next;
			} else {
				temp = temp.next;
				head = head.next;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		ListNode root = new ListNode(1);
		ListNode root1 = new ListNode(2);
		ListNode root2 = new ListNode(3);
		ListNode root3 = new ListNode(3);
		ListNode root4 = new ListNode(4);
		ListNode root5 = new ListNode(4);
		ListNode root6 = new ListNode(5);
		root.next = root1;
		root.next = root1;
		root1.next = root2;
		root2.next = root3;
		root3.next = root4;
		root4.next = root5;
		root5.next = root6;
		root6.next = null;

		DeleteDuplication deleteDuplication = new DeleteDuplication();

		deleteDuplication.printListNode(deleteDuplication.deleteDuplication(root));

	}

	public void printListNode(ListNode root) {
		ListNode p = root;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
	}
}
