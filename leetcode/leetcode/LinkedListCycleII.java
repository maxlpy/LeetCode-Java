package leetcode;

/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		do {
			if (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			} else 
				return null;
		} while (slow != fast);
		slow = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
