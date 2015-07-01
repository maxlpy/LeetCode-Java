package leetcode;


public class RemoveElement {
	public int removeElement(int[] arr, int target) {
		int len = 0;
		if (arr.length == 0)
			return 0;
		else {
			int j = -1;
			for (int i = 0; i < arr.length; i++) {
				if (target != arr[i]) {
					arr[++j] = arr[i];
					len++;
				}
			}
		}
		return len;
	}
}
