package org.relaxone;

import com.relaxone.common.TreeNode;

/**
 * a. ͨ��ǰ���������������ؽ�������
 * b. �ֱ��ȡ����������������ǰ����������������ʹ�õݹ�ʵ�ֶ��������ؽ�
 * @author zhoucw
 *
 */
public class ReconstructBinaryTree_4 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0 || pre.length != in.length)
			return null;
		int i = 0;
		// ���ҵ����������ķֽ��
		for (; i < in.length; i++) {
			if (pre[0] == in[i]) {
				break;
			}
		}
		int[] left_pre = new int[i], left_in = new int[i];
		int[] right_pre = new int[in.length - i -1], right_in = new int[in.length - i -1];
		// �õ���������ǰ��������������
		for (int j = 0; j < i; j++) {
			left_pre[j] = pre[j + 1];
			left_in[j] = in[j];
		}
		// �õ���������ǰ��������������
		for (int j = i + 1; j < in.length; j++) {
			right_pre[j - i - 1] = pre[j];
			right_in[j - i - 1] = in[j];
		}
		TreeNode root = new TreeNode(pre[0]);
		root.left = reConstructBinaryTree(left_pre, left_in);
		root.right = reConstructBinaryTree(right_pre, right_in);
		return root;
	}

	public static void main(String[] args) {
		ReconstructBinaryTree_4 binaryTree_4 = new ReconstructBinaryTree_4();
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		TreeNode root = binaryTree_4.reConstructBinaryTree(pre, in);
		TreeNode.printNode(root);
	}
}
