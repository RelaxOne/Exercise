package org.relaxone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeNode {
	public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		if (pRoot == null)
			return ret;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(null);
		queue.add(pRoot);
		while (queue.size() != 1) {
			TreeNode first = queue.poll();
			if (first == null) {
				Iterator<TreeNode> iterator = queue.iterator();
				ArrayList<Integer> list = new ArrayList<>();
				while (iterator.hasNext()) {
					list.add(iterator.next().val);
				}
				ret.add(list);
				queue.add(null);
				continue;
			}
			if (first.left != null)
				queue.add(first.left);
			if (first.right != null)
				queue.add(first.right);
		}

		return ret;
	}

	public String serilize(TreeNode pRoot) {
		if (pRoot == null)
			return null;
		StringBuffer buffer = new StringBuffer();
		serilizeTreeNode(pRoot, buffer);
		return buffer.toString();
	}

	public void serilizeTreeNode(TreeNode root, StringBuffer buffer) {
		if (root == null) {
			buffer.append("#,");
			return;
		}
		buffer.append(root.val);
		buffer.append(",");

		serilizeTreeNode(root.left, buffer);
		serilizeTreeNode(root.right, buffer);
	}

	public TreeNode deSerilize(String str) {
		String[] nodes = str.split(",");
		if (nodes.length < 3)
			return null;
		return deSerilizeTreeNode(nodes);
	}

	private int index = -1;

	public TreeNode deSerilizeTreeNode(String[] strs) {
		index++;
		if (!strs[index].equals("#")) {
			TreeNode node = new TreeNode(Integer.parseInt(strs[index]));
			node.left = deSerilizeTreeNode(strs);
			node.right = deSerilizeTreeNode(strs);
			return node;
		}
		return null;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode left1 = new TreeNode(6);
		TreeNode right1 = new TreeNode(7);
		TreeNode left_left = new TreeNode(8);
		TreeNode left_2 = new TreeNode(9);

		TreeNode right_2 = new TreeNode(15);
		TreeNode right_right = new TreeNode(10);

		root.left = left1;
		root.right = right1;

		left1.left = left_left;
		left1.right = left_2;

		left_left.left = null;
		left_left.right = null;

		left_2.left = null;
		left_2.right = null;

		right1.left = right_2;
		right1.right = right_right;

		right_right.left = null;
		right_right.right = null;

		right_2.left = null;
		right_2.right = null;
		PrintTreeNode nodeWithZ = new PrintTreeNode();
		System.out.println(nodeWithZ.print(root));

		System.out.println(nodeWithZ.serilize(root));

		String str = "5,6,8,#,#,9,#,#,7,15,#,#,10,#,#,";
		TreeNode treeNode = nodeWithZ.deSerilize(str);

		System.out.println(nodeWithZ.print(treeNode));
	}

}
