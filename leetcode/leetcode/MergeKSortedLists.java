package leetcode;

import java.util.List;

public class MergeKSortedLists {
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	} 
	public ListNode mergeKLists(List<ListNode> lists) {
		if (lists == null || lists.size() == 0) {
			return null;
		}
		return helper(lists, 0, lists.size()-1);
	}
	
	private ListNode helper(List<ListNode> lists, int l, int r) {
		if (l < r) {
			int m = (l + r)/2;
			return merge(helper(lists, l, m), helper(lists, m+1, r));
		}
		return lists.get(l);
	}
	
	private ListNode merge(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		dummy.next = l1;
		ListNode cur = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				l1 = l1.next;
			} else {
				ListNode next = l2.next;
				cur.next = l2;
				l2.next = l1;
				l2 = next;
			}
			cur = cur.next;
		}
		if (l2 != null) {
			cur.next = l2;
		}
		return dummy.next;
	}
}
