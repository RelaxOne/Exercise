package org.relaxone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KthNode {
	public TreeNode findKthNode(TreeNode pRoot, int k) {
		ArrayList<TreeNode> nodes = new ArrayList<>();
		
		iterator(pRoot,nodes);
		
		Collections.sort(nodes, new Comparator<TreeNode>() {
			@Override
			public int compare(TreeNode o1, TreeNode o2) {
				Integer v1 = o1.val;
				Integer v2 = o2.val;
				return v1.compareTo(v2);
			}
		});
		
		return nodes.get(k);
	}

	private void iterator(TreeNode pRoot, ArrayList<TreeNode> nodes) {
		if(pRoot==null)
			return;
		nodes.add(pRoot);
		iterator(pRoot.left, nodes);
		iterator(pRoot.right, nodes);
	}
}
