package leetcode;

import java.util.ArrayList;
import java.util.Arrays;


public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		int len = num.length;
		
		for (int i = 0; i < len - 3; i++) {
			if (i > 0 && num[i] == num[i-1])
				continue;
			for (int j = i + 1; j < len - 2; j++) {
				if (j > i + 1 && num[j] == num[j-1])
					continue;
				
				int l = j + 1;
				int r = len - 1;
				while (l < r) {
					int data = num[i] + num[j] + num[l] +num[r] - target;
					if (data == 0) {
						if ((l > j + 1) && num[l] == num[l-1]) {
							l++;
							continue;
						}
						if ((r < len - 1) && num[r] == num[r+1]) {
							r--;
							continue;
						}
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[l]);
						list.add(num[r]);
						res.add(list);
						l++;
						r--;
					} else if (data > 0) {
						r--;
					} else {
						l++;
					}
				}
			}
		}
		return res;
	}
}
