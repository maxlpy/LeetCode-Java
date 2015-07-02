package chp2;

public class Chp2_4_AddTwoLists {
	public static ListNode addTwoLists(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead, p = l1, q = l2;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			
			int digit = x + y + carry;
			carry = digit / 10;
			cur.next = new ListNode(digit % 10);
			cur = cur.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0)
			cur.next = new ListNode(carry);
		return dummyHead.next;
	}
}
