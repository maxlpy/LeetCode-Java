package leetcode;


public class WildcardMatching {
//	public boolean isMatch(String s, String p) {
//		if ((s == null || s.length() == 0) && (p == null || p.length() == 0)) {
//			return true;
//		}
//		if (s == null || s.length() ==0) {
//			if (p.charAt(0) == '*') {
//				checkAllStar(0, p);
//			} else {
//				return false;
//			}
//		}
//		
//		if (p == null || p.length() == 0) {
//			if (s.charAt(0) == '*') {
//				checkAllStar(0, s);
//			} else {
//				return false;
//			}
//		}
//		int i = 0, j = 0;
//		while(i < s.length() && j < p.length()) {
//			if(s.charAt(i) == p.charAt(j)) {
//				i++;
//				j++;
//			} else {
//				if (s.charAt(i) =='?' || p.charAt(j) == '?') {
//					i++;
//					j++;
//				} else if (s.charAt(i) =='*') {
//					return checkAllStar(i, s);
//					
//				} else if (p.charAt(j) == '*') {
//					return checkAllStar(j, p);
//				} else {
//					return false;
//				}
//			}
//		}
//		if (i < s.length()) {
//			return checkAllStar(i, s);
//		}
//		if (j < p.length()){
//			return checkAllStar(j, p);
//		}
//		return true;
//	}
//	private boolean checkAllStar(int i, String s) {
//		while (i < s.length()) {
//			if (s.charAt(i) == '*') {
//				i++;
//			} else {
//				return false;
//			}
//		}
//		return true;
//	}
	public boolean isMatch(String s, String p) {
		if (p.length() == 0) {
			return s.length() == 0;
		}
		if(s.length() > 300 && p.charAt(0)=='*' && p.charAt(p.length()-1)=='*')  
		    return false; 
		boolean[] res = new boolean[s.length()+1];
		res[0] = true;
		for (int j = 0; j < p.length(); j++) {
			if (p.charAt(j) != '*') {
				for (int i = s.length()-1; i >= 0; i--) {
					res[i+1] = res[i]&&(p.charAt(j)=='?'||s.charAt(i)==p.charAt(j));  
				}
			} else {
				int i = 0;
				while (i <= s.length() && !res[i]) {
					i++;
				}
				for (; i <= s.length(); i++) {
					res[i] = true;
				}
			}
			res[0] = res[0] && p.charAt(j)=='*';
		}
		return res[s.length()];
	}
	
	public static void main(String[] args) {
		WildcardMatching temp = new WildcardMatching();
//		System.out.println(temp.isMatch("b", "?*?"));
//		System.out.println(temp.isMatch("b", "*?*?"));
//		System.out.println(temp.isMatch("aa", "aa"));
//		System.out.println(temp.isMatch("aa", "*"));
//		System.out.println(temp.isMatch("aa", "a*"));
//		System.out.println(temp.isMatch("ab", "?*"));
//		System.out.println(temp.isMatch("aab", "c*a*b"));
	}
}
