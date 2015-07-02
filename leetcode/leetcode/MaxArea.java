package leetcode;

/*
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container.
 */

public class MaxArea {
	public int maxArea(int[] arr) {
		if (arr.length <= 1)
	        return 0;
		int max = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			max = Math.max(max, (right - left) * Math.min(arr[left], arr[right]));
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}
}