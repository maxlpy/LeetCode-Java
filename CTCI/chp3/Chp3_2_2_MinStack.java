package chp3;

import java.util.Stack;

public class Chp3_2_2_MinStack {
	public class StackWithMin extends Stack<Integer> {
		Stack<Integer> stack;
		public StackWithMin() {
			stack = new Stack<Integer>();
		}
		public void push(int val) {
			if (val < min()) {
				stack.push(val);
			}
		}
		public Integer pop() {
			int val = super.pop();
			if(val == min()) {
				stack.pop();
			}
			return val;
		}
		public int min() {
			if (stack.isEmpty()) {
				return Integer.MAX_VALUE;
			} else {
				return stack.peek();
			}
		}
	}
}
