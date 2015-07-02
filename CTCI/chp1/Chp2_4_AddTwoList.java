package chp1;

import CTCI.ListNode;

public class Chp2_4_AddTwoList {
	public ListNode addTwoList(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead, p = l1, q = l2;
		int x = 0, y = 0, carry = 0;
		
		while (p != null || q != null) {
			x = (p != null)? p.data: 0;
			y = (q != null)? q.data: 0;
			int res = x + y + carry;
			carry = res % 10;
			res = res / 10;
			cur.next = new ListNode(res);
			cur = cur.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0) {
			cur.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}
