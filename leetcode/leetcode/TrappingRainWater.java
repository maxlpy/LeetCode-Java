package leetcode;


public class TrappingRainWater {
	public int trap(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int max = 0;
		int res = 0;
		int[] container = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			container[i] = max;
			max = Math.max(max, num[i]);
		}
		max = 0;
		for (int i = num.length-1; i >= 0; i--) {
			container[i] = Math.min(max, container[i]);
			max = Math.max(max, num[i]);
			res += container[i] - num[i] > 0 ? container[i] - num[i]: 0;
		}
		return res;
	}
}
