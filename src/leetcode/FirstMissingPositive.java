package leetcode;


public class FirstMissingPositive {
	public int firstMissingPositive(int[] num) {
		if (num == null || num.length == 0) {
			return 1;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0 && num[i] <= num.length && num[num[i]-1] != num[i]) {
				int temp = num[num[i]-1];
				num[num[i]-1] = num[i];
				num[i] = temp;
				i--;  // recompute this point
			}
		}
		for (int i = 0; i< num.length; i++) {
			if (num[i] != i+1) {
				return i+1;
			}
		}
		return num.length+1;
	}
}
