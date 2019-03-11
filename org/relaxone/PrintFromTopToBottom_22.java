package org.relaxone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.relaxone.common.TreeNode;

/**
 * a. ���ϵ��´�ӡ��������ͬ��� �����ҵ�˳���ӡ
 * b. ���ö�����Ϊ���������ڵ���ӵ������У�˳���ջ��������ջԪ�ص����ҽڵ���뵽������
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
