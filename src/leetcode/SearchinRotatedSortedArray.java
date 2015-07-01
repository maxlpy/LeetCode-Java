package leetcode;


public class SearchinRotatedSortedArray {
	public int search(int[] A, int target) {
        if (A == null) {
            return -1;
        }
        int l = 0; 
        int r = A.length - 1;
        int m = (l + r) / 2;
        while (l <= r) {
            m = (l + r) / 2;
            if (A[m] == target) {
                return m;
            } else if (A[m] < A[r]) {
                if (target > A[m] && target <= A[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target < A[m] && target >= A[l]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}
