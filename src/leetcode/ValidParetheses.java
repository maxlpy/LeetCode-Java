package leetcode;

import java.util.Stack;

public class ValidParetheses {
	public static boolean isValid(String str) {
		Stack<Character> stack = new Stack<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
				stack.push(str.charAt(i));
			if(str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}') {
				if (!stack.isEmpty()) {
					c = stack.peek();
					if (c == '(' && (str.charAt(i) != ')'))
						return false;
					if (c == '[' && (str.charAt(i) != ']'))
						return false;
					if (c == '{' && (str.charAt(i) != '}'))
						return false;
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		String str = "{}";
		System.out.println(isValid(str));
	}
}
