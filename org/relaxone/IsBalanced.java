package org.relaxone;

public class IsBalanced {
	public static boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
			return false;
		
		return isBalanced(root.left) && isBalanced(root.right);
	}

	public static int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		return Math.max(left, right) + 1;
	}

}
