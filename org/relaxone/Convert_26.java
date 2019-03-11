package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. ������ת����˫������(���ܴ����κνڵ�)
 * b. �����еĽڵ���뵽�����У����������еĽڵ���֯��˫������
 * @author zhoucw
 *
 */
public class Convert_26 {
	
	/**
	 * ����������ķ�ʽ����һ�ö�������������ڵ����������
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
		// �������еĽڵ㰴�ռ��ϵ�˳���ų�����
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
