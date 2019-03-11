package org.relaxone;

import com.relaxone.common.ListNode;

/**
 * a. �ϲ������������������䵥������������
 * b. (1) ��������Ϊ��ʱ�����ؿ�
 *    (2) ����һ������Ϊ��ʱ��������һ������
 *    (3�� ����������Ϊ��ʱ��ѭ���Ƚ���������Ľڵ�ֵ������С�ķ����������У�
 *    	   ����ж��Ƿ����������Ѿ������ϣ�δ�����������뵽����β��
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
			// ѭ��������������ͷ��С�Ľڵ�
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
			// �ж��Ƿ����������������
			if(p1 != null)
				p.next = p1;
			if(p2 != null)
				p.next = p2;
			return result;
		}
	}
}
