package org.relaxone;

public class GetNext {
	public TreeLinkNode getNext(TreeLinkNode pNode) {
		if(pNode == null)
			return null;
		// ����ǰ�ڵ���������,����Ϊ����������ߵĽڵ�
		if(pNode.right != null) {
			pNode = pNode.right;
			while(pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
		// ����ǰ�ڵ�û��������,�� Ѱ�ҵ�ǰ��һ���ڵ����丸�ڵ���ڵ�Ľڵ�
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