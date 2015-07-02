package leetcode;


public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode fast = head;
		ListNode slow = head;
		do {
			fast = fast.next;
			slow = slow.next;
			if (fast == null) {
				return false;
			} else {
				fast = fast.next;
				if (fast == slow)
					return true;
			}
		} while (slow != null && fast != null);
		return false;
	}
}
