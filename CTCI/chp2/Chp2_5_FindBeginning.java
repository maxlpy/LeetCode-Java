package chp2;

// 2.5	Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.

public class Chp2_5_FindBeginning {
	public ListNode findBeginning(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode walker = head;
		ListNode runner = head;
		while (runner.next != null) { // here should check runner.next, not runner
			walker = walker.next;
			runner = runner.next.next;
		}
		if (runner.next == null) {
			return null;
		}
		walker = head;
		while (walker != runner) {
			walker = walker.next;
			runner = runner.next;
		}
		return walker;
	}
}
