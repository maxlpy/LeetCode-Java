package leetcode;

import java.util.LinkedList;


public class SimplifyPath {
	public static String simplifyPath(String path) {
		if (path == null || path.length() == 0) 
			return null;
		
		LinkedList<String> stack = new LinkedList<String>();
		StringBuilder res = new StringBuilder();
		int i = 0;
		
		while (i < path.length()) {
			int index = i;
			StringBuilder temp = new StringBuilder();
			while (i < path.length() && path.charAt(i) != '/') {
				temp.append(path.charAt(i));
				i++;
			}
			if (index != i) {
				String str = temp.toString();
				if (str.equals("..")) {
					if (!stack.isEmpty())
						stack.pop();
				} else if (!str.equals(".")) {
					stack.push(str);
				}
			}
			i++;
		}
		
		if (!stack.isEmpty()) {
			String[] strs = stack.toArray(new String[stack.size()]);
			for (int j = strs.length - 1; j >= 0; j--) {
				System.out.println(strs[j]);
				res.append("/" + strs[j]);
			}
		}
		if (res.length() == 0) {
			return "/";
		}
		return res.toString();
	}
	public static void main(String[] args) {
		String path = "/a/./b/./c/";
		String path1 = "/home//foo/";
		System.out.println(simplifyPath(path));
	}
}
