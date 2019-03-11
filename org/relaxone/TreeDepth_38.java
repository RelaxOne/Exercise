package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. 求二叉树的深度
 * b. 递归求左子树和右子树的深度，返回值较大的一个 + 1
 * @author zhoucw
 *
 */
public class TreeDepth_38 {
	public static int treedepth(TreeNode root) {
		if(root == null)
			return 0;
		int left_depth = treedepth(root.left);
		int right_depth = treedepth(root.right);
		return Math.max(left_depth, right_depth)+1;
	}
}
