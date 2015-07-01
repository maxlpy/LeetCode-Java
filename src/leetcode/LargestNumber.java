package leetcode;
// https://leetcode.com/problems/largest-number/
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public static String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String left, String right) {
                String leftRight = left.concat(right);
                String rightLeft = right.concat(left);
                return rightLeft.compareTo(leftRight);
            }
        });
        String res = new String();
        for (String s: strs)
        	res += s;
        if (res.charAt(0) == '0')
        	return "0";
        else 
        	return res;
    }
	public static void main(String[] args) {
		int[] data = {3, 30, 34, 5, 9};  // 9534330
		System.out.println(largestNumber(data));
	}
}
