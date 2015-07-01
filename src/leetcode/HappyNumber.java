package leetcode;
// https://leetcode.com/problems/happy-number/
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static boolean isHappy(int num) {
		if (num <= 0) {
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		return helper(num, set);
	}
	public static boolean helper(int num, Set<Integer> set) {
		if (num == 1) {
			return true;
		}
		int sum = 0;
		while (num > 0) {
			int temp = num % 10;
			sum += temp*temp;
			num = num / 10;
		}
		if (sum == 1) {
			return true;
		} else if (set.contains(sum)) {
			return false;
		} else {
			set.add(sum);
			return helper(sum, set);
		}
	}
	public static void main(String[] args) {
		System.out.println(isHappy(18));
	}
}
