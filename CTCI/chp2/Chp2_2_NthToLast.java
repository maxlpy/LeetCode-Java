package chp2;

// 2.2 Implement an algorithm to find the nth to last element of a singly linked list.
public class Chp2_2_NthToLast {
	public ListNode nthToLast(ListNode head, int n) {
		if (head == null || n < 1) {
			return null;
		}
		ListNode prev = head;
		ListNode cur = head;
		for (int i = 0; i < n - 1; i++) {
			if (cur.next == null) {
				return null;
			} 
			cur = cur.next;
		}
		while (cur.next != null) {
			prev = prev.next;
			cur = cur.next;
		}
		return prev;
	}
}
