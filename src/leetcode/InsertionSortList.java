package leetcode;

//class ListNode {
//	int val;
//	ListNode next;
//	ListNode(int val) {
//		this.val = val;
//		next = null;
//	}
//}
public class InsertionSortList {
	public static ListNode insertionSortList(ListNode head) {
		if (head == null)
			return head;
		ListNode res = new ListNode(Integer.MIN_VALUE);
		ListNode prev = res;
		ListNode cur = head;
		
		while (cur != null) {
			while(prev.next != null && prev.next.val < cur.val) {
				prev = prev.next;
			}
			ListNode node = cur;
			cur = cur.next;
			if (prev.next == null) {
				prev.next = node;
				node.next = null;
			} else {
				ListNode temp = prev.next;
				prev.next = node;
				node.next = temp;
			}
			prev = res;  // This step is important.
		}
		return res.next;
	}
	public static void main(String[] args) {
		ListNode list = new ListNode(2);
		ListNode list1 = new ListNode(3);
		list.next = list1;
		ListNode list2 = new ListNode(0);
		list1.next = list2;
		ListNode res = insertionSortList(list);
		System.out.println(res.val + " " + res.next.val + " " + res.next.next.val);
	}
}
