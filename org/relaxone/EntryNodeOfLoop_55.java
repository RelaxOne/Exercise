package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.ListNode;

/**
 * a. �ж�һ�������Ƿ�������������价����ڽڵ� 
 * b. ���������жϽڵ��Ƿ�����ڸ��������У��粻��������Ӹýڵ㵽�����У����򣬷��ظýڵ�� next �ڵ�
 * 
 * @author zhoucw
 *
 */
public class EntryNodeOfLoop_55 {
	public ListNode entryNode(ListNode pHead) {
		if (pHead == null)
			return null;
		ListNode p = pHead;
		ArrayList<ListNode> list = new ArrayList<>();
		while (p != null) {
			if (list.contains(p.next)) {
				return p.next;
			} else {
				list.add(p);
			}
			p = p.next;
		}

		return null;
	}
}
