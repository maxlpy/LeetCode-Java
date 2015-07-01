package leetcode;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * 
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvaluateReversePolishNotation {
	public static int evalRPN2(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            if (isDigital(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int elm2 = stack.pop();
                int elm1 = stack.pop();
                int res;
                if (tokens[i].equals("+")) {
                    res = elm1 + elm2;
                } else if (tokens[i].equals("-")) {
                    res = elm1 - elm2;
                } else if (tokens[i].equals("*")) {
                    res = elm1 * elm2;
                } else if (tokens[i].equals("/")) {
                    res = elm1 / elm2;
                } else 
                	res = 0;
                stack.push(res);
            }
        }
        return stack.pop();
    }
	public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            if (isDigital(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                stack.push(cacl(stack.pop(), stack.pop(), tokens[i]));
            }
        }
        return stack.pop();
    }
	public static Integer cacl(Integer num2, Integer num1, String op) {
		switch(op) {
		case "+": 
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			return num1 / num2;
		default:
			return 0;
		} 
	}
	private static boolean isDigital(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] str = {"3", "-4", "+"};
		System.out.println(evalRPN(str));
	}
}
