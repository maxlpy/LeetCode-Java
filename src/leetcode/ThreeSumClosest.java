package leetcode;

import java.util.Arrays;


public class ThreeSumClosest {
	public static int threeSumClosest(int[] num, int target) {
		int res = 0;
		int len = num.length;
		if (len < 3)
			return res;
		Arrays.sort(num);
		int left = 0;
		int right = len - 1;
		int diff = Integer.MAX_VALUE;
		int sum = 0;
		int minus = 0;
		
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && num[i] == num[i - 1])  // Avoid repeating
				continue;
			left = i + 1;
			right = len - 1;
			
			while (left < right) {
				if (left > i + 1 && num[left] == num[left - 1]) { // Avoid repeating
					left++;
					continue;
				}
				if (right < len - 1 && num[right] == num[right + 1]) {
					right--;
					continue;
				}
				sum = num[left] + num[right] + num[i];
				minus = sum - target;

				
				if (Math.abs(minus) < diff) {
					diff = Math.abs(minus);
					res = sum;
				}
				if (minus == 0) 
					return res;
				else if (minus > 0)
					right--;
				else 
					left++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] num = {0,2,1,-3};
		int target = 1;
		System.out.println(threeSumClosest(num, target));
	}
}
