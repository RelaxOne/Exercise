package org.relaxone;

import com.relaxone.common.ListNode;

/**
 * a. 合并两个递增链表并保持其单调不减的特性
 * b. (1) 两个链表为空时，返回空
 *    (2) 其中一个链表为空时，返回另一个链表
 *    (3） 两个链表都不为空时，循环比较两个链表的节点值，并将小的放入结果链表中，
 *    	   最后判断是否两个链表都已经添加完毕，未完则把链表加入到链表尾部
 * @author zhoucw
 *
 */
public class Merge_16 {
	public ListNode merge(ListNode list1, ListNode list2) {
		ListNode p1 = list1, p2 = list2;
		if(p1 == null && p2 ==null) {
			return null;
		}else if(p1 == null && p2 != null) {
			return p2;
		}else if(p2 == null && p1 != null) {
			return p1;
		}else {
			ListNode result = null;
			if(p1.val <= p2.val) {
				result = p1;
				p1 = p1.next;
				result.next = null;
			}else {
				result = p2;
				p2 = p2.next;
				result.next = null;
			}
			ListNode p = result;
			// 循环添加两个链表的头中小的节点
			while(p1 != null && p2 != null) {
				if(p1.val > p2.val) {
					p.next = p2;
					p2 = p2.next;
					
				}else {
					p.next = p1;
					p1 = p1.next;
				}
				p = p.next;
				p.next = null;
			}
			// 判断是否两个链表都遍历完毕
			if(p1 != null)
				p.next = p1;
			if(p2 != null)
				p.next = p2;
			return result;
		}
	}
}
