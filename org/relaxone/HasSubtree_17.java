package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.TreeNode;

/**
 * a. 判断一个 TreeNode 是否是另一个 TreeNode 的子树
 * b. 遍历两个TreeNode,并将其加入到一个 ArrayList 集合中，判断一个集合是否包含另一个集合
 * @author zhoucw
 *
 */
public class HasSubtree_17{
	/**
	 * 用先序遍历的方法将树的值添加到集合中
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
	 * 判断一个树是否是另一个树的子树
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
