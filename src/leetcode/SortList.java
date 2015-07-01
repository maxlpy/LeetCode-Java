package leetcode;


public class SortList {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		fast = slow.next;
		slow.next = null;
		slow = sortList(head);
		fast = sortList(fast);
		return mergeSort(slow, fast);
	}
	public ListNode mergeSort(ListNode slow, ListNode fast) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		while (slow != null && fast != null) {
			if (slow.val > fast.val) {
				cur.next = fast;
				fast = fast.next;
			} else {
				cur.next = slow;
				slow = slow.next;
			}
			cur = cur.next;
		}
		if (slow != null)
			cur.next = slow;
		if (fast != null)
			cur.next = fast;
		return head.next;
	}
}
