package chp1;

import CTCI.ListNode;

// 2.2	 Implement an algorithm to find the nth to last element of a singly linked list.
public class Chp2_2_Nth2LastElement {
	// Iterate n steps using one pointer first, then use the second pointer to record the nth element to the first element.
	// Time: O(n), Space: O(1)
	public ListNode findNth2LastElement(ListNode head, int n) {
		if (head == null || n < 1) {
			return null;
		}
		ListNode p = head;
		ListNode q = head;
		for (int i = 0; i < n-1; i++) {
			if (q == null) {
				return null;
			} 
			q = q.next;
		}
		while (q.next != null) {
			p = p.next;
			q = q.next;
		}

		return p;
	}
}
