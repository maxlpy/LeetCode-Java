package leetcode;

//Given a non-negative number represented as an array of digits, plus one to the number.
//
//The digits are stored such that the most significant digit is at the head of the list.

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	public static void plusOne1(List<Integer> digits) {
		for (int i = digits.size() - 1; i >= 0; i--) {
			int digit = digits.get(i);
			if (digit < 9) {
				digits.set(i, digit + 1);
				return;
			}
			else {
				digits.set(i, 0);
			}
		}
		digits.add(0);
		digits.set(0, 1);
	}
	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		System.out.println(len);
		
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] res = new int[len + 1];
		for (int i = res.length - 1; i >0; i--) {
			res[i] = digits[i-1];
		}
		res[0] = 1;
		return res;
	}
	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		int[] data = {9,9,9};
		digits.add(9);
		digits.add(5);
		int[] result = plusOne(data);
		for (Integer item: result)
			System.out.print(item);
	}
}
