package leetcode;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 * For example, Given board =
 * 
 * [ ["ABCE"], 
 *   ["SFCS"], 
 *   ["ADEE"] 
 * ] 
 * 
 * word = "ABCCED", -> returns true, 
 * word = "SEE", -> returns true, 
 * word = "ABCB", -> returns false.
 */
public class WordSearch {
	public boolean exist(char[][] board, String word) {
		int len = word.length();
		if (word == null || len == 0)
			return false;
		int rows = board.length;
		int cols = board[0].length;
		if (board == null || rows == 0 || cols == 0) 
			return false;
		boolean[][] used = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (search(board, word, 0, i, j, used))
					return true;
			}
		}
		return false;
	}
	public boolean search(char[][] board, String word, int index, int i, int j, boolean[][] used) {
		if (index == word.length())
			return true;
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length 
				|| used[i][j] || board[i][j] != word.charAt(index))
			return false;
		used[i][j] = true;
		boolean res =  search(board, word, index + 1, i - 1, j, used)
					|| search(board, word, index + 1, i + 1, j, used)
					|| search(board, word, index + 1, i, j - 1, used)
					|| search(board, word, index + 1, i, j + 1, used);
		used[i][j] = false;
		return res;
	}
}
