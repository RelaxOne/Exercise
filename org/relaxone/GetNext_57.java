package org.relaxone;

import com.relaxone.common.TreeLinkNode;

/**
 * a. ��������� next �ڵ�
 * b. (1). ����ǰ�ڵ������������� next �ڵ�Ϊ������������ߵĽڵ�
 * 	  (2). ����ǰ�ڵ�û������������ next �ڵ�Ϊ�������е�ǰ�ڵ㸸�ڵ����丸�ڵ���ڵ�
 * @author zhoucw
 *
 */
public class GetNext_57 {
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
