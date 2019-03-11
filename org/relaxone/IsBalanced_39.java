package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. �жϸ����Ķ������Ƿ���ƽ�������
 * b. �ݹ�ķ�ʽ������������������Ȳ����� 1
 * @author zhoucw
 *
 */
public class IsBalanced_39 {
	
	public boolean isBalanced(TreeNode root) {
		if(root == null)
			return true;
		// �ж����������ĸ߶��Ƿ񳬹�1
		if(Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
			return false;
		// �ж����������ֱ��Ƿ���ƽ�������
		return isBalanced(root.left) && isBalanced(root.right);
	}

	/**
	 * ������������
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
