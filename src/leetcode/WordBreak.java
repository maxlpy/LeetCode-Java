package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * For example, given s = "leetcode", dict = ["leet", "code"].
 * Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak {
	public boolean wordBreak(String str, Set<String> dic) {
		Map<String, Boolean> map = new HashMap<>();
		for (String s: dic) {
			map.put(s, true);
		}
		int len = str.length();
		boolean[] strMap = new boolean[len + 1];
		strMap[0] = true;
		for (int i = 1; i <= len; i++) {
			for (int j = 0; j < i; j++) {
				if (strMap[j] && map.containsKey(str.substring(j, i)))
					strMap[i] = true;
			}
		}
		return strMap[len];
	}
}
