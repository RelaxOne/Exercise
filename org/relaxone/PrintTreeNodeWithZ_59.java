package org.relaxone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.relaxone.common.TreeNode;

/**
 * a. 按照 之 型打印二叉树
 * b. 将同层的节点加入队列，并判断奇数行和偶数行正序或倒序打印节点值
 *     queue.descendingIterator()倒叙输出队列，队列的底层实现是双向链表
 * @author zhoucw
 *
 */
public class PrintTreeNodeWithZ_59 {

	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		if(pRoot == null)
			return ret;
		
		boolean leftToRight = true;
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.addLast(null);
		queue.addLast(pRoot);
		while(queue.size() != 1) {
			TreeNode first = queue.removeFirst();
			if(first == null) {
				Iterator<TreeNode> iter = null;
				ArrayList<Integer> list = new ArrayList<>();
				if(leftToRight)
					iter  = queue.iterator();
				else
					iter = queue.descendingIterator();// 队列的倒序
				while(iter.hasNext()) {
					TreeNode next = iter.next();
					list.add(next.val);
				}
				ret.add(list);
				queue.addLast(null);
				leftToRight = !leftToRight;
				continue;
			}
			if(first.left != null)
				queue.addLast(first.left);
			if(first.right != null)
				queue.addLast(first.right);
		}
		
		return ret;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode left1 = new TreeNode(6);
		TreeNode right1 = new TreeNode(7);
		TreeNode left_left = new TreeNode(8);
		TreeNode left_2 = new TreeNode(9);

		TreeNode right_right = new TreeNode(10);
		TreeNode right_2 = new TreeNode(15);

		root.left = left1;
		root.right = right1;

		left1.left = left_left;
		left1.right = null;

		left_left.left = left_2;
		left_left.right = null;

		left_2.left = null;
		left_2.right = null;

		right1.left = null;
		right1.right = right_right;

		right_right.left = right_2;
		right_right.right = null;

		right_2.left = null;
		right_2.right = null;
		
		PrintTreeNodeWithZ_59 nodeWithZ = new PrintTreeNodeWithZ_59();
		ArrayList<ArrayList<Integer>> print = nodeWithZ.print(root);
		System.out.println(print);
		
	}
}
