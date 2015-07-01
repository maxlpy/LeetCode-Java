package leetcode;


//Given an array where elements are sorted in ascending order, 
//convert it to a height balanced BST.

public class ConvertSortedArraytoBinarySearchTree {

	public TreeNode sortedArrayToBST (int[] array) {
		TreeNode root = sortedArrayToBST(array, 0, array.length - 1);
		return root;
	}
	
	public TreeNode sortedArrayToBST(int[] array, int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end)/2;
		TreeNode root = new TreeNode(array[mid]);
		root.left = sortedArrayToBST(array, start, mid - 1);
		root.right = sortedArrayToBST(array, mid + 1, end);
		
		return root;
	}
}
