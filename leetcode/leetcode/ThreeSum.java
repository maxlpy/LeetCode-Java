package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a +
 * b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * 
 * Note:
 * 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ? b ?
 * c) The solution set must not contain duplicate triplets.
 * 
 * For example, given array S = {-1 0 1 2 -1 -4},
 * 
 * A solution set is: (-1, 0, 1) (-1, -1, 2)
 */

public class ThreeSum {
	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		int len = num.length;
		if (len < 3)
			return res;
		Arrays.sort(num);
		int i = 0;
		int left = 0;
		int right = len - 1;
		for (i = 0; i <= len - 3; i++) {
			if (i > 0 && num[i] == num[i - 1])  // Avoid repeating
				continue;
			left = i + 1;
			right = len - 1;
			while (left < right) {
				int sum = num[left] + num[right] + num[i];
				if (sum == 0) {
					if (left != i + 1 && num[left] == num[left - 1]) { // Avoid repeating
						left++;
						continue;
					}
					if (right != len - 1 && num[right] == num[right + 1]) {
						right--;
						continue;
					}
					ArrayList<Integer> items = new ArrayList<>();
					items.add(num[i]);
					items.add(num[left]);
					items.add(num[right]);
					res.add(items);
					right--;
					left++;
				} else {
					if (sum > 0) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] num = {0,0,0};
		System.out.println(threeSum(num));
	}
}
