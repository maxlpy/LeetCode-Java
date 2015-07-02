package leetcode;


public class IsOneEditDistance {
	public static boolean isOneEditDistance(String s, String t) {
		int m = s.length();
		int n = t.length();
		int i = 0;
		int shift = 0;
		if (m > n) isOneEditDistance(t, s);
		if (n - m > 1) return false;
		else if (n - m == 1) {
			while (i < m) {
				if (s.charAt(i) == t.charAt(i)) i++;
				else if (s.charAt(i) == t.charAt(i+1)) i++;
				else return false;
			}
		} else { // m == n
			while(i < m) { 
				if (s.charAt(i) != t.charAt(i)) 
					shift++;
				if (shift > 1) return false;
				i++;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "aba";
		String t = "aaa";
		System.out.println(isOneEditDistance(s, t));
	}
}
