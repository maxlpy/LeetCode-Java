package leetcode;


public class StrStr {
	public static int strStr(String haystack, String needle) {
		int len1 = needle.length();
		int len2 = haystack.length();
		if (len1 > len2)
			return -1;
		if (len1 == 0)
			return 0;

		for (int i = 0; i < len2; i++) {
			if (len2 - i < len1)
				return -1;
			String substr = haystack.substring(i, i + len1);
			if (substr.equals(needle))
				return i;
		}
		
		return -1;
	}
	public static int strStr2(String haystack, String needle) {
		for (int i = 0; i <= haystack.length(); i++) {
			for (int j = 0; j <= needle.length(); j++) {
				if (j == needle.length()) return i;
				if (i + j == haystack.length()) return -1;
				if (needle.charAt(j) != haystack.charAt(i + j)) break;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "a";
		System.out.println(strStr2(str1, str2));
	}
}
