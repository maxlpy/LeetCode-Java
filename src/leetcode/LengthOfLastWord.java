package leetcode;


public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int index = s.length() - 1;
		while (index >= 0 && s.charAt(index) == ' ')
			index--;
		int index2 = index;
		while(index2 >= 0 && s.charAt(index2) != ' ')
			index2--;
		return index -index2;
	}
}
