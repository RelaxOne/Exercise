package org.relaxone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.relaxone.common.TreeNode;

/**
 * a. 从上到下打印二叉树，同层次 从左到右的顺序打印
 * b. 利用队列作为辅助，将节点添加到队列中，顺序出栈，并将出栈元素的左右节点加入到队列中
 * 
 * @author zhoucw
 *
 */
public class PrintFromTopToBottom_22 {

	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null)
			return result;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			result.add(node.val);
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
		return result;
	}

}
