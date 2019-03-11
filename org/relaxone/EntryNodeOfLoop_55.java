package org.relaxone;

import java.util.ArrayList;

import com.relaxone.common.ListNode;

/**
 * a. 判断一个链表是否包含环，输入其环的入口节点 
 * b. 遍历链表，判断节点是否存在于辅助集合中，如不存在则添加该节点到集合中，否则，返回该节点的 next 节点
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
