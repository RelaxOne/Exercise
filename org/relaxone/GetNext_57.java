package org.relaxone;

import com.relaxone.common.TreeLinkNode;

/**
 * a. 求二叉树的 next 节点
 * b. (1). 若当前节点有右子树，则 next 节点为右子树中最左边的节点
 * 	  (2). 若当前节点没有右子树，则 next 节点为左子树中当前节点父节点是其父节点左节点
 * @author zhoucw
 *
 */
public class GetNext_57 {
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
