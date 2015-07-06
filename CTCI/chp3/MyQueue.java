package chp3;

import org.junit.Test;

public class MyQueue {
	private Node first;
	private Node last;
	
	public MyQueue() {
		this.first = null;
		this.last = null;
	}
	
	public void enqueue(Object val) {
		if (last == null) {
			last = new Node(val);
			first = last;  // set first here
		} else {
			last.next = new Node(val);
			last = last.next;
		}
	}
	
	public Object dequeue() {
		if (first == null) {
			last = null;  // set last to null here
			return null;
		} 
		Object val = first.val;
		first = first.next;
		return val;
	}
	
	public boolean isEmpty() {
		return first == null && last == null;
	}
	
	public String toString() {
		Node p = first;
		StringBuilder sbuilder = new StringBuilder();
		while (p != null) {
			sbuilder.append(p.val);
			p = p.next;
		}
		return sbuilder.toString();
	}
	
	@Test
	public void test() {
		MyQueue que = new MyQueue();
		for (int i = 0; i < 10; i++) {
			que.enqueue(i);
			System.out.println(que);
		}
		while (!que.isEmpty()) {
			que.dequeue();
			System.out.println(que);
		}
	}
}
