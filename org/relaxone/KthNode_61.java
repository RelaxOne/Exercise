package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. �����������ĵ� K ���ڵ� 
 * b. ����������������븨�������У����ؼ����еĵ� k ���ڵ�
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

	// �������������
	private void iterator(TreeNode pRoot, ArrayList<TreeNode> nodes) {
		if (pRoot == null)
			return;
		iterator(pRoot.left, nodes);
		nodes.add(pRoot);
		iterator(pRoot.right, nodes);
	}
}
