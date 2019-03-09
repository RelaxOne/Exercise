package org.relaxone;

import java.util.ArrayList;

public class EntryNodeOfLoop {
	public ListNode entryNode(ListNode pHead) {
		if(pHead == null)
			return null;
		ListNode p = pHead;
		ArrayList<ListNode> list = new ArrayList<>();
		while(p!=null) {
			if(list.contains(p.next)) {
				for(int i = 0;i<list.size();i++)
					if(list.get(i).equals(p.next))
						return list.get(i);
			}else {
				list.add(p);
			}
			p = p.next;
		}
		
		return null;
	}
}
