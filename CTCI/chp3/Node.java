package chp3;

public class Node implements Comparable<Object> {
	Object val;
	Node next;
	
	public Node() {
		this.val = null;
		next = null;
	}
	public Node(Object value) {
		this.val = value;
		next = null;
	}

	@Override
	public int compareTo(Object other) {
		return compareTo(other);
	}
	
}
