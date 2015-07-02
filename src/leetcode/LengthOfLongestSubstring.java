package leetcode;


public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String str) {
		int max = 0;
		int start = 0, end = 0, j = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			end = i;
			j = start;
			while (j < i) {
				if (str.charAt(j) == str.charAt(i)) {
					start = j + 1;
					break;
				}
				j++;
			}
			if (end - start > max)
				max = end - start;
		}
		return max+1;
	}
	public static void main(String[] args) {
		String str = "abcdecfghijk";
		System.out.println(lengthOfLongestSubstring(str));
	}
}
