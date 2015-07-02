package chp1;

import CTCI.ListNode;
// 2.5	Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.
public class Chp2_5_FindBeginning {
	public ListNode findBeginning(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode walker = head;
		ListNode runner = head;
		while (runner.next != null) { // here should check runner.next, rather than runner
			walker = walker.next;
			runner = runner.next.next;
			if (walker == runner) {
				break;
			}
		}
		if (runner.next == null) { // no loop
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
