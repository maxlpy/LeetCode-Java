package leetcode;

// https://leetcode.com/problems/reverse-words-in-a-string/
// Given an input string, reverse the string word by word.
// For example,
// Given s = "the sky is blue",
// return "blue is sky the".

public class ReverseWordsinString {
    public String reverseWords(String str) {
		StringBuilder sbuilder = new StringBuilder();
		int j = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				j = i;
			}
			else if (i == 0 || str.charAt(i-1) == ' ') {
				if (sbuilder.length() != 0) {
					sbuilder.append(' ');
				}
				sbuilder.append(str.substring(i, j));
			}
		}
		return sbuilder.toString();
	}
}
