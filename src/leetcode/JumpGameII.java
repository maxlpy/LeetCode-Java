package leetcode;


public class JumpGameII {
	public int jump(int[] num) {
		if (num == null || num.length == 0) {
			return 0;
		}
		int lastReach = 0;
		int reach = 0;
		int step = 0;
		for (int i = 0; i <= reach && i < num.length; i++) {
			if (i > lastReach) {
				step++;
				lastReach = reach;
			}
			reach = Math.max(num[i]+i, reach);
		}
		if (reach < num.length-1) {
			return 0;
		}
		return step;
	}
}
