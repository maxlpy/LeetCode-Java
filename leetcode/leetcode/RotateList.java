package leetcode;


public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		ListNode walker = head;
		ListNode runner = head;
		int len = 0;
		while(runner != null && len < n) {
			runner = runner.next;
			len++;
		}
		if (runner == null) {
			n = n % len;
			runner = head;
			len = 0;
			while (runner != null && len < n) {
				runner = runner.next;
				len++;
			}
		}
		while (runner.next != null) {
			walker = walker.next;
			runner = runner.next;
		}
		runner.next = head;
		ListNode newHead = walker.next;
		walker.next = null;
		walker.next = null;
		return newHead;
	}
}
