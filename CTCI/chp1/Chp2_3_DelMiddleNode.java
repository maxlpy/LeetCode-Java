package chp1;

import CTCI.ListNode;

// 2.3 Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
public class Chp2_3_DelMiddleNode_ {
	public ListNode delMiddleNode(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode walker = head;
		ListNode runner = head;
		if (runner.next == null) {
			walker = head;
		}
		
		return head;
	}
}
