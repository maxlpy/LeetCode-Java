package chp3;

import java.util.Stack;

class NodeWithMin {
	public int value;
	public int min;
	public NodeWithMin(int val, int min) {
		this.value = val;
		this.min = min;
	}
}

public class Chp3_2_1_MinStack extends Stack<NodeWithMin> {
	public void push(int val) {
		int newMin = Math.min(val, min());
		super.push(new NodeWithMin(val, newMin));
	}
	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
}
