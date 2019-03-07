package org.relaxone;

public class GetNext {
	public TreeLinkNode getNext(TreeLinkNode pNode) {
		if(pNode == null)
			return null;
		// 若当前节点有右子树,则结果为右子树最左边的节点
		if(pNode.right != null) {
			pNode = pNode.right;
			while(pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
		// 若当前节点没有右子树,则 寻找当前第一个节点是其父节点左节点的节点
		while(pNode.next != null) {
			if(pNode.next.left == pNode)
				return pNode.next;
			pNode = pNode.next;
		}
		return null;
	}
}

class TreeLinkNode{
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;
	TreeLinkNode(int val){
		this.val= val;
	}
}