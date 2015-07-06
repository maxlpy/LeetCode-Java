package chp2;

import org.junit.Test;

public class ListNode<T> {
	public ListNode<T> next = null;
	public T val;
	
	public ListNode() {}
	
	public ListNode(T val) {
		this.val = val;
		this.next = null;
	}
	
	public void appendToTail(int val) {
		ListNode newNode = new ListNode(val);
		ListNode cur = this;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = newNode;
	}
	
	public ListNode deleteNode(ListNode head, Object val) {
		if (head == null) {
			return null;
		}
		ListNode p = head;
		if (p.val == val) {
			return p.next;
		}
		while (p.next != null) {
			if (p.next.val == val) {
				p = p.next.next;
				return head;
			}
			p = p.next;
		}
		return head;
	}
	public void print() {
		ListNode p = this;
		System.out.println(p.val);
		while (p.next != null) {
			System.out.println(p.next.val);
		}
	}
}
