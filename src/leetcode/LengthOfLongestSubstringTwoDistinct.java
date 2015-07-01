package leetcode;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringTwoDistinct {
	public static int lengthOfLongestSubstring(String str) {
		int start = 0, max = 0;
		int len = str.length();
		Map<Character, Integer> map = new HashMap<>();
		Collection<Integer> set = map.values();
		for (int i = 0; i < len; i++) {
			if (map.get(str.charAt(i)) != null)
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			else 
				map.put(str.charAt(i), 1);
			
			while (map.size() > 2) {
				if (map.get(str.charAt(start)) == 1)
					map.remove(str.charAt(start));
				else 
					map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
				start = start + 1;
			}
			int sum = 0;
			for (Integer item: set)
				sum += item;
			if (sum > max)
				max = sum;
		}
		return max;
	}
	public static void main(String[] args) {
		String str = "abaaccccdccc";
		System.out.println(lengthOfLongestSubstring(str));
	}
}
