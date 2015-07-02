package CTCI;


public class Node_ {
	Node_ next = null;
	int data;
	
	public Node_(int num) {
		data = num;
	}
	
	@SuppressWarnings("null")
	public void addNodeTail(int num) {
		Node_ end = new Node_(num);
		Node_ n = this;
		
		while(n != null) {
			n = n.next;
		}
		n.next = end;
	}
}
