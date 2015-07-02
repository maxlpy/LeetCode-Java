package leetcode;

public class CountPrimes {
	public int countPrimes1(int n) {
		if (n <= 1) {
			return 0;
		}
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (i != 2 && i / 2 == 0) {
				continue;
			}
			int innterFlag = 0;
			for (int j = 2; j < i; j++) {
				if (i / j == 0) {
					innterFlag = 1;
					break;
				} 
			}
			if (innterFlag == 0) {
				count++;
			}
		}
		return count;
	}
	public int countPrimes(int n) {
		if (n <= 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
	}
}
