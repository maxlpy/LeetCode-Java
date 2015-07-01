package leetcode;

/*
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * put: 7 -> 0 -> 8
*/
public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode cur = dummyHead, p = l1, q = l2;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			
			int digit = x + y + carry;
			carry = digit / 10;
			cur.next = new ListNode(digit % 10);
			cur = cur.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0)
			cur.next = new ListNode(carry);
		return dummyHead.next;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		ListNode l2 = new ListNode(0);
		ListNode res = addTwoNumbers(l1, l2);
		System.out.print(res.val);
		System.out.println(res.next.val);
	}
}
