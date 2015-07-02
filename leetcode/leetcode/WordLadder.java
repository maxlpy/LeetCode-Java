package leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Given two words (start and end), and a dictionary, find the length of
 * shortest transformation sequence from start to end, such that:
 * 
 * Only one letter can be changed at a time Each intermediate word must exist in
 * the dictionary For example,
 * 
 * Given: start = "hit" end = "cog" dict = ["hot","dot","dog","lot","log"]
 * 
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * 
 * Note:
 * 
 * Return 0 if there is no such transformation sequence. All words have the same
 * length. All words contain only lowercase alphabetic characters.
 */
public class WordLadder {
	public static int ladderLength(String start, String end, Set<String>dict) {
		if (dict.size() == 0)
			return 0;
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
		
		wordQueue.add(start);
		distanceQueue.add(1);
		
		while (!wordQueue.isEmpty()) {
			String curWord = wordQueue.pop();
			Integer curDistance = distanceQueue.pop();
			if (curWord.equals(end)) {
				return curDistance;
			}
			for (int i = 0; i < curWord.length(); i++) {
				char[] curChar = curWord.toCharArray();
				for (char c = 'a'; c <= 'z'; c++) {
					curChar[i] = c;
					String newWord = new String(curChar);
					if (dict.contains(newWord)) {
						wordQueue.add(newWord);
						distanceQueue.add(curDistance + 1);
						dict.remove(newWord);
					} else if (newWord.equals(end)) {
						return curDistance + 1;
					}
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		System.out.println(ladderLength(start, end, dict));
	}
}
