package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. 判断一棵二叉树是不是对称的
 * b. (1) 判断左子树的先序遍历集合和右子树的后序遍历集合是否相等
 * 	  (2) 求得当前是的镜像二叉树，并比较两棵树是否相等
 * @author zhoucw
 *
 */
public class IsSymmetrical_58 {

	public boolean isSysmmetrical(TreeNode pRoot) {
		if (pRoot == null)
			return true;
		ArrayList<String> leftList = new ArrayList<>();
		ArrayList<String> rightList = new ArrayList<>();
		if (pRoot.left != null && pRoot.right != null) {
			iterator_left(pRoot.left, leftList);
			iterator_right(pRoot.right, rightList);
		} else if (pRoot.left == null && pRoot.right == null) {
			return true;
		} else {
			return false;
		}

		if (leftList.size() != rightList.size())
			return false;
		for (int i = 0; i < leftList.size(); i++) {
			if (!leftList.get(i).equals(rightList.get(i)))
				return false;
		}
		return true;
	}
	
	/**
	 * 先遍历左边后遍历右边
	 * @param node
	 * @param nodes
	 */
	public void iterator_left(TreeNode node, ArrayList<String> nodes) {

		nodes.add(String.valueOf(node.val));
		if (node.left != null)
			iterator_left(node.left, nodes);
		else
			nodes.add("#");
		if (node.right != null)
			iterator_left(node.right, nodes);
		else
			nodes.add("#");
	}

	/**
	 * 先遍历右边后遍历左边
	 * @param node
	 * @param nodes
	 */
	public void iterator_right(TreeNode node, ArrayList<String> nodes) {
		nodes.add(String.valueOf(node.val));
		if (node.right != null)
			iterator_right(node.right, nodes);
		else
			nodes.add("#");
		if (node.left != null)
			iterator_right(node.left, nodes);
		else
			nodes.add("#");
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

		IsSymmetrical_58 symmetrical = new IsSymmetrical_58();

		System.out.println(symmetrical.isSysmmetrical(root));

	}

}
