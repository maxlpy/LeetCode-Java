package leetcode;


//Given a sorted array of integers, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].
		
public class SearchForARange {
	
	public int[] searchRange(int[] array, int target) {
		int[] ret = {-1, -1};
		int counter = 0;
		for (int i = 0; i < array.length; i++) 
			if (array[i] == target) {
				ret[1] = i;
				++counter;
			}	
		ret[0] = ret[1] - counter + 1;
			
		return ret;
	}
	
	public static void main(String[] args) {
		int[] array = {5, 7, 7, 8, 8, 10};
		
		SearchForARange temp = new SearchForARange();
		int[] res = temp.searchRange(array, 8);
		System.out.println(res[0] + res[1]);
	}
}
