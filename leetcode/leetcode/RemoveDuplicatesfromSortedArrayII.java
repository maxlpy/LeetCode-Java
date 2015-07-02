package leetcode;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */

// Time complexity is O(n), space complexity is O(1).

public class RemoveDuplicatesfromSortedArrayII {
	public int removeDuplicates(int[] data) {
        if (data == null || data.length == 0) {
        	return 0;
        }
        int count = 0;
        int total = 0;
        for (int i = 0; i < data.length; i++) {
        	if (i > 0 && (data[i] == data[i-1])) {
        		count++;
        		if (count > 1) {
        			continue;  // continue is efficient here
        		}
        	} else {
        		count = 0;
        	}
        	data[total++] = data[i];
        }
		return total;
    }
	public static void main(String[] args) {
		
		int[] data = {1,1,1,2};
		RemoveDuplicatesfromSortedArrayII test = new RemoveDuplicatesfromSortedArrayII();
		int res = test.removeDuplicates(data);
		System.out.println(res);
	}
}
