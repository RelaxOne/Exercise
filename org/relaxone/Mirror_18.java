package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. �������Ķ�������Ϊ�侵��Ķ�����
 * b. �ݹ齻���������������������� 
 * @author zhoucw
 *
 */
public class Mirror_18 {
	public void mirror(TreeNode root) {
		if (root == null)
			return;
		// ����������������
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
