package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;
/**
 * a. ��ӡ���������н��ֵ�ĺ�Ϊ��������������·��(·�����ķ���ǰ��)
 * b. �ݹ����������������ǰ�ڵ����ҽڵ㶼Ϊ�ղ�������·����Ϊ target ʱ�����ü�����ӵ��������
 *    ���ж������������Ƿ��������·�������ɾ������ӵĽڵ��ֵ, ����ͬ�����һ���ڵ�
 * @author zhoucw
 *
 */
public class FindPath_24 {

	public void getPath(TreeNode root, ArrayList<ArrayList<Integer>> listall, ArrayList<Integer> list, int target) {
		if (root == null)
			return;
		list.add(root.val);
		target -= root.val;
		if (target == 0 && root.left == null && root.right == null) {
			listall.add(new ArrayList<>(list));
		}
		getPath(root.left, listall, list, target);
		getPath(root.right, listall, list, target);
		list.remove(list.size() - 1);
	}

	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> listall = new ArrayList<>();
		if (root == null)
			return listall;
		ArrayList<Integer> list = new ArrayList<>();
		getPath(root, listall, list, target);
		return listall;
	}

}
