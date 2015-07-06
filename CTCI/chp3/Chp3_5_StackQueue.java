package chp3;

import java.util.Stack;

import org.junit.Test;

public class Chp3_5_StackQueue {
	public class StackQueue<T> {
		private Stack<T> stack, reversed_stack;
		
		public StackQueue() {
			stack = new Stack<T>();
			reversed_stack = new Stack<T>();
		}
		
		public boolean isEmpty() {
			return stack.isEmpty() && reversed_stack.isEmpty();
		}
		
		public void add(T val) {
			if (stack.isEmpty()) {
				shift(reversed_stack, stack);
			}
			stack.push(val);
		}
		
		public T remove() {
			if (!stack.isEmpty()) {
				shift(stack, reversed_stack);
			}
			return reversed_stack.pop();
		}
		
		public T peek() {
			if (!stack.isEmpty()) {
				shift(stack, reversed_stack);
			}
			return reversed_stack.peek();
		}
		
		public void shift(Stack<T> src, Stack<T> dst) {
			while (!src.isEmpty()) {
				dst.push(src.pop());
			}
		}
		
		public String toString() {
			if (!stack.isEmpty()) {
				return stack.toString();
			}
			shift(reversed_stack, stack);
			return stack.toString();
		}
	}
	
	 @Test
	   public void test() {
	      StackQueue<Integer> qu = new StackQueue<Integer>();
	      System.out.println(qu);
	      qu.add(1);
	      qu.add(2);
	      System.out.println(qu);
	      System.out.println(qu.peek());
	      qu.remove();
	      System.out.println(qu);
	      qu.add(4);
	      System.out.println(qu);
	      System.out.println(qu.peek());
	   }
}
