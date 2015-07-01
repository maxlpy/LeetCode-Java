package leetcode;

/*
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	TreeNode(int x) { 
//		this.val = x;
//	}
//}
public class ValidBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return valid(root, null, null);
	}
	public boolean valid(TreeNode p, Integer low, Integer high) {
		if (p == null) return true;
		return (low == null || p.val > low)&&(high == null || p.val < high) 
				&&(valid(p.left, low, p.val))&&(valid(p.right, p.val, high));
	}
}
