package leetcode;



public class RemoveDuplicatesfromSortedArray {
	public static int removeDuplicates(int[] arr) {
		if (arr.length == 0)
			return 0;
		else if (arr.length == 1) {
			return 1;
		} else {
			int ret = 1;
			int j = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i-1] != arr[i]) {
					arr[++j] = arr[i];
					ret++;
				}
			}
			return ret;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 3, 4};
		System.out.println(removeDuplicates(arr));
		System.out.println(arr.length);
	}
}
