package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. 判断给定的二叉树是否是平衡二叉树
 * b. 递归的方式求树的左右子树的深度不超过 1
 * @author zhoucw
 *
 */
public class IsBalanced_39 {
	
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		// 判断左右子树的高度是否超过1
		if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
			return false;
		// 判断左右子树分别是否是平衡二叉树
		return isBalanced(root.left) && isBalanced(root.right);
	}

	/**
	 * 求二叉树的深度
	 * @param root
	 * @return
	 */
	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		return Math.max(left, right) + 1;
	}

}
