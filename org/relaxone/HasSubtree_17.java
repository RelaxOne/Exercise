package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. �ж�һ�� TreeNode �Ƿ�����һ�� TreeNode ������
 * b. ��������TreeNode,��������뵽һ�� ArrayList �����У��ж�һ�������Ƿ������һ������
 * @author zhoucw
 *
 */
public class HasSubtree_17{
	/**
	 * ����������ķ���������ֵ��ӵ�������
	 * @param root
	 * @param list
	 */
	public void iterator(TreeNode root, ArrayList<String> list) {
		if(root == null) {
			list.add("#");
			return;
		}
		list.add(String.valueOf(root.val));
		iterator(root.left, list);
		iterator(root.right, list);
	}
	
	/**
	 * �ж�һ�����Ƿ�����һ����������
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		if(root1 == null || root2 ==null)
            return false;
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		iterator(root1, list1);
		iterator(root2, list2);
		
		return list1.containsAll(list2);
	}
	
}
