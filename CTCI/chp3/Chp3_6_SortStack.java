package chp3;

import java.util.Random;
import java.util.Stack;

import org.junit.Test;

public class Chp3_6_SortStack {
	public void sortStack(Stack<Integer> stack) {
		Stack<Integer> ordered_st = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!ordered_st.isEmpty() && temp > ordered_st.peek()) {
				stack.push(ordered_st.pop());
			}
			ordered_st.push(temp);
		}
		while (!ordered_st.isEmpty()) {
			stack.push(ordered_st.pop());
		}
	}
	
	@Test
	public void test() {
		Stack<Integer> st = new Stack<Integer>();
		Random rd = new Random();
		rd.setSeed(System.currentTimeMillis());
		for (int i = 0; i < 10; i++) {
			st.push(rd.nextInt(10));
		}
		System.out.println(st);
		sortStack(st);
		System.out.println(st);
	}
}
