package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. 二叉树转换成双向链表(不能创建任何节点)
 * b. 将所有的节点加入到集合中，并将集合中的节点组织成双向链表
 * @author zhoucw
 *
 */
public class Convert_26 {
	
	/**
	 * 用中序遍历的方式遍历一棵二叉树，并将其节点放入链表中
	 * @param root
	 * @param list
	 */
	public void iterator(TreeNode root, ArrayList<TreeNode> list) {
		if (root == null)
			return;
		iterator(root.left, list);
		list.add(root);
		iterator(root.right, list);
	}
	
	public TreeNode convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return pRootOfTree;

		ArrayList<TreeNode> list = new ArrayList<>();
		iterator(pRootOfTree, list);
		TreeNode result = list.get(0);
		if (list.size() == 1)
			return result;
		result.right = list.get(1);
		// 将集合中的节点按照集合的顺序排成链表
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

	
}
