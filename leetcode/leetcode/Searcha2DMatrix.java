package leetcode;

/** 
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 *
 * Consider the following matrix:
 *
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 */
public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] num, int target) {
		int m = num.length; // Rows
		int n = num[0].length; // Columns
		
		int left = 0, right = m*n - 1;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			int x = mid / n;
			int y = mid % n;
			if (num[x][y] == target) {
				return true;
			} else if (num[x][y] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
	}
}
