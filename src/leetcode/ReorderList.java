package leetcode;

/*
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 */
public class ReorderList {
	public ListNode reorderList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		ListNode slow = head, fast = head;
		
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode leftHalf = head;
		ListNode rightHalf = null;
		if (fast.next != null) {
			rightHalf = reverseList(slow.next);
			slow.next = null;
		} else {
			rightHalf = reverseList(slow);
			ListNode temp = head;
			while (temp.next != slow) {
				temp = temp.next;
			}
			temp.next = null;
		}
		ListNode cur = dummy;
		while (leftHalf != null && rightHalf != null) {
			cur.next = leftHalf;
			cur = cur.next;
			leftHalf = leftHalf.next;
			cur.next = rightHalf;
			cur = cur.next;
			rightHalf = rightHalf.next;
		}
		if (leftHalf != null)
			cur.next = leftHalf;
		else if (rightHalf != null) {
			cur.next = rightHalf;
		}
		return dummy.next;
	}
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = new ListNode(0);
		ListNode cur = head;
		ListNode next = null;
		while (cur != null) {
			next = cur.next;
			cur.next = prev.next;
			prev.next = cur;
			cur = next;
		}
		return prev;
	}
}
