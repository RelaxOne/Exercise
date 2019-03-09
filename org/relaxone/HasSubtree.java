package org.relaxone;

import java.util.ArrayList;

public class HasSubtree {
	public void iterator(TreeNode root, ArrayList<String> list) {
		if(root == null) {
			list.add("#");
			return;
		}
		list.add(String.valueOf(root.val));
		iterator(root.left, list);
		iterator(root.right, list);
	}
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
