package chp3;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

import org.w3c.dom.Node;

import chp2.ListNode;
/**
 * Implement SetOfStacks
 * composed of several stacks and should create a new stack once the previous one exceeds
 * capacity
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack
 */
// FOLLOW UP
// implement a function popAt(int index) which performs a pop operation on a specific sub-stack

public class Chp3_3_SetOfStacks {
	public class SetOfStacks {
		private ArrayList<Stack<Integer>> stacks;
		private int stackIndex;
		private int capacity;
		
		public SetOfStacks(int capacity) {
			stacks = new ArrayList<Stack<Integer>>();
			stackIndex = 0;
			this.capacity = capacity;
		}
		
		public void push(int val) {
			if (stackIndex < 0) {
				stackIndex = 0;
			}
			while (getCurrentStack().size() == capacity) {
				stackIndex++;
			}
			getCurrentStack().push(val);
		}
		
		public Integer peek() {
			while (getCurrentStack().isEmpty()) {
				stacks.remove(stackIndex);
				stackIndex--;
			}
			return getCurrentStack().peek();
		}
		
		public Integer pop() {
			while (getCurrentStack().isEmpty()) {
				stacks.remove(stackIndex);
				stackIndex--;
			}
			return getCurrentStack().pop();
		}
		
		public Integer popAt(int index) {
	        if (index > stackIndex || index < 0)
	           throw new IndexOutOfBoundsException();
	        Stack<Integer> st = stacks.get(index);
	        if (st.isEmpty())
	           throw new NullPointerException();
	        return st.pop();
	    }		
		
		private Stack<Integer> getCurrentStack() {
			if (stackIndex < 0) {
				throw new EmptyStackException();
			}
			while (stackIndex >= stacks.size()) {
				stacks.add(new Stack<Integer>());
			}
			return stacks.get(stackIndex);
		}
		
		public String toString() {
			return stacks.toString();
		}
	}
}
