package chp3;

import org.junit.Test;

public class MyStack {
	// Implement the stack
	private Node top;
	
	public MyStack() {
		top = null;
	}
	
	public Object pop() {
		if (top == null) 
			throw new NullPointerException();
		Object val = top.val;
		top = top.next;
		return val;
	}
	
	public void push(Object item) {
		Node temp = new Node(item);
		temp.next = top;
		top = temp;
	}
	
	public Object peek() {
		return top.val;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public String toString() {
		Node p = top;
		StringBuilder sbuilder = new StringBuilder();
		while(p != null) {
			sbuilder.append(p.val);
			p = p.next;
		}
		return sbuilder.reverse().toString();
	}
	
	@Test
	public void test() {
		MyStack st = new MyStack();
		for (int i=0; i<10; i++){
			st.push(i);
		    System.out.println(st);
		}
		for (int i=0; i<10; i++){
		   st.pop();
		   System.out.println(st);
		}
	}
}
