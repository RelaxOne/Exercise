package org.relaxone;

public class RandomListNode_Solution {

	public RandomListNode randomListNode(RandomListNode pHead) {
		if(pHead == null)
			return null;
		RandomListNode currentNode = pHead;
		// ��������ڵ�,���ڵ����ԭ�ڵ�ĺ���
		while(currentNode != null) {
			RandomListNode cloneNode  = new RandomListNode(currentNode.label);
			RandomListNode next = currentNode.next; 
			
			cloneNode.next = next;
			currentNode.next = cloneNode;
			currentNode = next;
		}
		// ���±����ڵ�, ����ֵ�ڵ�� random
		currentNode = pHead;
		while(currentNode != null) {
			if(currentNode.random ==null)
				currentNode.next.random = null;
			else
				currentNode.next.random = currentNode.random.next;
			currentNode = currentNode.next.next;
		}
		// �����ƺ�������ֳ���
		currentNode = pHead;
		RandomListNode result = pHead.next;
		while(currentNode!=null) {
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			if(cloneNode.next == null)
				cloneNode.next = null;
			else
				cloneNode.next = cloneNode.next.next;
			currentNode = currentNode.next;
		}
		return result;
	}
}

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	public RandomListNode(int label) {
		this.label = label;
	}
}