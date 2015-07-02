package leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/

public class MajorityElement {
	// HashMap, Time: O(n), Space: O(n)
	public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return -1;
        }
        int threshhold = nums.length / 2 ;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x: nums) {
        	if (map.containsKey(x)) {
        		map.put(x, 1 + map.get(x));
        	} else {
        		map.put(x, 1);
        	}
	        if (map.get(x) > threshhold) {
				return x;
	        }
        }
        return -1;
    }
	// Boyer-Moore Majority Vote Algorithm
	// http://en.wikipedia.org/wiki/Boyer-Moore_Majority_Vote_Algorithm
	// Time: O(n), Space: O(1)
	public static int majorityElement2(int[] nums) {
		int n = nums.length;
        int candidate = nums[0], counter = 0;
        for (int i : nums) {
            if (counter == 0) {
                candidate = i;
                counter = 1;
            } else {
                if (i == candidate) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }
 
        counter = 0;
        for (int i : nums) {
            if (i == candidate) counter++;
        }
        if (counter < (n + 1) / 2) return -1;
        return candidate;
	}
	public static void main(String[] args) {
		int[] data = {1};
		System.out.println(majorityElement(data));
	}
}
