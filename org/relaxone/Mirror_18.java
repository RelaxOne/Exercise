package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. 将给定的二叉树变为其镜像的二叉树
 * b. 递归交换树及其子树的左右子树 
 * @author zhoucw
 *
 */
public class Mirror_18 {
	public void mirror(TreeNode root) {
		if (root == null)
			return;
		// 交换树的左右子树
		TreeNode left = root.left;
		root.left = root.right;;
		root.right = left;
		mirror(root.left);
		mirror(root.right);
	}

	public static void main(String[] args) {
		Mirror_18 mirror_18 = new Mirror_18();
		TreeNode root = TreeNode.init();
		
		TreeNode.printNode(root);
		
		System.out.println();
		
		mirror_18.mirror(root);
		
		TreeNode.printNode(root);
	}
}
