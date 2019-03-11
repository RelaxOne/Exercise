package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;
/**
 * a. 打印出二叉树中结点值的和为输入整数的所有路径(路径长的放在前面)
 * b. 递归遍历二叉树，当当前节点左右节点都为空并且所有路径和为 target 时，将该集合添加到结果集中
 *    再判断其左右子树是否有满足的路径，最后删除刚添加的节点的值, 遍历同层的下一个节点
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
