package leetcode;


public class JumpGame {
	public boolean canJump(int[] num) {
		if (num == null || num.length == 0) {
			return false;
		}
		int reach = 0;
		for (int i = 0; i <= reach && i < num.length; i++) {
			reach = Math.max(num[i] + i, reach);
		}
		if (reach < num.length-1) {
			return false;
		}
		return true;
	}
}
