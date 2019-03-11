package org.relaxone;

import com.relaxone.common.RandomListNode;

/**
 * a. 复制一个复杂链表(next 指针指向下一个节点， random 指针指向任意节点) 
 * b. (1) 先将节点复制后，放入源节点的后面 
 *    (2) 赋值复制节点的 random 节点 
 *    (3) 将复制链表从原来的链表中分离出来
 * 
 * @author zhoucw
 *
 */
public class RandomListNode_25 {

	public RandomListNode randomListNode(RandomListNode pHead) {
		if (pHead == null)
			return null;
		RandomListNode currentNode = pHead;
		// 复制链表节点,将节点放在原节点的后面
		while (currentNode != null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode next = currentNode.next;

			cloneNode.next = next;
			currentNode.next = cloneNode;
			currentNode = next;
		}
		// 重新遍历节点, 将赋值节点的 random
		currentNode = pHead;
		while (currentNode != null) {
			if (currentNode.random == null)
				currentNode.next.random = null;
			else
				currentNode.next.random = currentNode.random.next;
			currentNode = currentNode.next.next;
		}
		// 将复制后的链表拆分出来
		currentNode = pHead;
		RandomListNode result = pHead.next;
		while (currentNode != null) {
			RandomListNode cloneNode = currentNode.next;
			currentNode.next = cloneNode.next;
			if (cloneNode.next == null)
				cloneNode.next = null;
			else
				cloneNode.next = cloneNode.next.next;
			currentNode = currentNode.next;
		}
		return result;
	}
}
