package org.relaxone;

import java.util.ArrayList;

public class Convert {
	public TreeNode convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return pRootOfTree;

		ArrayList<TreeNode> list = new ArrayList<>();
		iterator(pRootOfTree, list);
		TreeNode result = list.get(0);
		if (list.size() == 1)
			return result;
		result.right = list.get(1);
		for (int head = 0, cur = 1, after = 2; cur < list.size(); cur++, head++, after++) {
			TreeNode treeCur = list.get(cur);
			treeCur.left = list.get(head);
			if (cur != list.size() - 1) {
				treeCur.right = list.get(after);
			}else {
				treeCur.right = null;
			}
		}
		return result;
	}

	public void iterator(TreeNode root, ArrayList<TreeNode> list) {
		if (root == null)
			return;
		iterator(root.left, list);
		list.add(root);
		iterator(root.right, list);
	}
}
