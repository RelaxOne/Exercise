package org.relaxone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	public static ArrayList<Integer> printFromTopToButton(TreeNode root){
		
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		if(root== null)
			return null;
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node.left != null)
				queue.offer(node.left);
			if(node.right != null)
				queue.offer(node.right);
			list.add(node.val);
		}
		return list;
	}
	
	public static void main(String[] args) {
		TreeNode treeNode  = new TreeNode(0);
		
		TreeNode treeNode1  = new TreeNode(1);
		TreeNode treeNode2  = new TreeNode(2);
		TreeNode treeNode3  = new TreeNode(3);
		TreeNode treeNode4  = new TreeNode(4);
		TreeNode treeNode5  = new TreeNode(5);
		
		treeNode.left = treeNode1;
		treeNode.right = treeNode2;
		
		treeNode1.left = treeNode3;
		treeNode1.right = null;
		
		treeNode3.left = null;
		treeNode3.right = null;
		
		treeNode2.left = treeNode4;
		treeNode2.right = treeNode5;
		
		treeNode4.left = null;
		treeNode4.right = null;
		treeNode5.left = null;
		treeNode5.right = null;
		
		ArrayList<Integer> list = printFromTopToButton(treeNode);
		
		for(Integer integer:list) {
			System.out.println(integer);
		}
	}
}

class TreeNode{
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val) {
		this.val = val;
	}
}
