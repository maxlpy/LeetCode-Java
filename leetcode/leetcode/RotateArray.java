package leetcode;
// https://leetcode.com/problems/rotate-array/

/*
 * Method:
 * Time: O(n), Space: O(n)
 */
public class RotateArray {
	public static void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k > len) {  // consider this condition
	        k = k % len;
		}
        int[] res = new int[len];
        for (int i = 0; i < k; i++) {
        	res[i] = nums[len - k + i];
        }
        for (int i = 0; i < len - k; i++) {
        	res[i + k] = nums[i];
        }
        System.arraycopy( res, 0, nums, 0, len);
    }
	public static void main(String[] args) {
		int[] nums = {1,2};
		rotate(nums, 1);
		for (int x: nums)
			System.out.println(x);
	}
}
