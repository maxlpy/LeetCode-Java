package chp2;

// 2.3 Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
public class Chp2_3_DeleteNode {
	public boolean deleteNode(ListNode head) {
		if (head == null || head.next == null) { // pay more attention to head.next condition.
			return false;
		}
		ListNode next = head.next;
		head.val = next.val;
		head.next = next.next;
		return true;
	}
}
