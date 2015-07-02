package leetcode;

import java.util.Arrays;

public class ReverseWords {
	public String reverseWords(String str) {
		String[] res = str.split(" ");
		int len = res.length;
		int left = 0;
		int right = len - 1;
		while (left < right) {
			String temp = null;
			temp = res[left];
			res[left] = res[right];
			res[right] = temp;
			left++;
			right--;
		}
		return Arrays.toString(res);
	}
	public String reverseWords2(String str) {
		String[] res = str.split(" ");
		StringBuffer sbuf = new StringBuffer();
		for (int i = res.length - 1; i >= 0; i--) {
			sbuf.append(res[i]);
			if (i != 0)
				sbuf.append(" ");
		}
		return sbuf.toString();
	}
	public String reverseWords3(String str) {
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
	public String reverseWords4(String str) {
		StringBuilder sbuilder = new StringBuilder();
		String[] str1 = str.split("\\s+");
		String[] str2 = str.split("\\S+");
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(str2));
		int i = str1.length;
		int j = str2.length;
		System.out.println(i + " and " + j);
		while (i > 0) {
			i--; j--;
			sbuilder.append(str2[j]);
			sbuilder.append(str1[i]);
			
		}
		sbuilder.append(str2[--j]);
		return sbuilder.toString();
	}
	
	public static void main(String[] args) {
		String str = "abc";
		ReverseWords ret = new ReverseWords();
		
		System.out.println(ret.reverseWords3(str));
	}
}
