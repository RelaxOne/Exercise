package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. 二叉搜索树的第 K 个节点 
 * b. 中序遍历二叉树加入辅助集合中，返回集合中的第 k 个节点
 * 
 * @author zhoucw
 *
 */
public class KthNode_61 {
	public TreeNode findKthNode(TreeNode pRoot, int k) {
		if (k <= 0)
			return null;
		ArrayList<TreeNode> nodes = new ArrayList<>();

		iterator(pRoot, nodes);
		if (k > nodes.size())
			return null;
		return nodes.get(k - 1);
	}

	// 中序遍历二叉树
	private void iterator(TreeNode pRoot, ArrayList<TreeNode> nodes) {
		if (pRoot == null)
			return;
		iterator(pRoot.left, nodes);
		nodes.add(pRoot);
		iterator(pRoot.right, nodes);
	}
}
