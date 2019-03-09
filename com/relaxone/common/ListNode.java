package com.relaxone.common;

public class ListNode {
	public int val;
	public ListNode next = null;
	public ListNode(int val){
		this.val = val;
	}
	public static ListNode init() {
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
		return root;
	}
	public static void printNode(TreeNode root) {
		if(root == null)
			return;
		System.out.print(root.val + " ");
		printNode(root.left);
		printNode(root.right);
	}
}
