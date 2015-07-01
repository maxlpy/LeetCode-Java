package leetcode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int x: nums) {
        	if (set.contains(x)) {
        		return true;
        	} else {
        		set.add(x);
        	}
        }
        return false;
	}
	public static void main(String[] args) {
		int[] nums = {0};
		System.out.println(containsDuplicate(nums));
	}
}
