package leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] str) {
		if (str.length == 0)
			return "";
		int index = 0;
		while (index < str[0].length()) {
			char c = str[0].charAt(index);
			for (int i = 1; i < str.length; i++) {
				if (index >= str[i].length() || str[i].charAt(index) != c) {
					return str[0].substring(0, index);
				}
			}
			index++;
		}
		return str[0];
	}
	public static void main(String[] args) {
		String[] str = {"aa", "a"};
		System.out.println(longestCommonPrefix(str));
	}	
}
