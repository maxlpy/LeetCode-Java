package leetcode;


public class LongestPalidrome {
	public static String longestPalidrome(String str) {
		int start = 0, end = 0;
		for (int i = 0; i < str.length(); i++) {
			int len1 = expandAroundCenter(str, i, i);
			int len2 = expandAroundCenter(str, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len-1)/2;
				end = i + len/ 2;
			}
			System.out.println(start);
			System.out.println(end);
		}
		return str.substring(start, end + 1);
	}
	private static int expandAroundCenter(String str, int left, int right) {
		int L = left, R = right;
		while(L >= 0 && R < str.length() && str.charAt(L)== str.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}
	public static void main(String[] args) {
		String str = "cabaddd";
		System.out.println(longestPalidrome(str));
	}
}
