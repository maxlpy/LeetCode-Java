package leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples. 
 * [1,3,5,6], 5 -> 2
 * [1,3,5,6], 2 -> 1
 * [1,3,5,6], 7 -> 4
 * [1,3,5,6], 0 -> 0
 */
public class SearchInsertPosition {
	public static int searchInsert(int[] arr, int target) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int mid = (i + j) / 2;
			if (arr[mid] == target)
				return mid;
			if (arr[mid] < target) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		return arr[i] < target ? i + 1 : i;
	}
	public static void main(String[] args) {
		int[] arr = {1};
		int target =2;
		System.out.println(searchInsert(arr, target));
	}
}
