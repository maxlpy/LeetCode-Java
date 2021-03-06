package leetcode;


/** 
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * 
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */

public class RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode root = new ListNode(0);
		ListNode slow = root;
		ListNode fast = root;
		root.next = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return root.next;
	}
	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode res = removeNthFromEnd(listNode, 1);
		while (res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
}
