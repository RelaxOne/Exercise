package org.relaxone;

import com.relaxone.common.ListNode;
import com.relaxone.common.TreeNode;

public class ReconstructBinaryTree_4 {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		if (pre.length == 0 || in.length == 0 || pre.length != in.length)
			return null;
		int i = 0;
		//先找到左右子树的分界点
		for (; i < in.length; i++) {
			if (pre[0] == in[i]) {
				break;
			}
		}

		int[] left_pre = new int[i], left_in = new int[i];
		int[] right_pre = new int[in.length - i], right_in = new int[in.length - i];
		//得到左子树的前序遍历和中序遍历
		for (int j = 0; j < i; j++) {
			left_pre[j] = pre[j + 1];
			left_in[j] = in[j];
		}
		//得到右子树的前序遍历和中序遍历
		for(int j = i ;j<in.length;j++) {
			right_pre[j] = pre[j];
			right_in[j] = in[j];
		}
		TreeNode root = new TreeNode(pre[0]);
		root.left = reConstructBinaryTree(left_pre, left_in);
		root.right = reConstructBinaryTree(right_pre, right_in);
		return root;
	}
	
	public static void main(String[] args) {
		ReconstructBinaryTree_4 binaryTree_4 = new ReconstructBinaryTree_4();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode root = binaryTree_4.reConstructBinaryTree(pre, in );
		ListNode.printNode(root);
		
	}
}
