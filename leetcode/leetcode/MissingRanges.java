package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	public static List<String> findMingsingRanges(int[] data, int start, int end) {
		List<String> res = new ArrayList<>();
		int prev = start - 1;
		
		for (int i = 0; i <= data.length; i++) {
			int cur = (i==data.length)? end + 1: data[i];
			if (cur - prev >= 2)
				res.add((prev + 1) + "->" + (cur-1));
			prev = cur;
		}
			
		return res;
	}
	public static void main(String[] args) {
		int[] data = {};
		int start = 0;
		int end = 99;
		List<String> res = findMingsingRanges(data, start, end);
		for (String item: res)
			System.out.print('"'+item+'"' + " ");
	}
}
