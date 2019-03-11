package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. ������������
 * b. �ݹ���������������������ȣ�����ֵ�ϴ��һ�� + 1
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
