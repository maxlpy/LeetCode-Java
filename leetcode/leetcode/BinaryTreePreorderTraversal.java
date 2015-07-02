package leetcode;

import java.util.ArrayList;
import java.util.List;


//Given a binary tree, return the preorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [1,2,3].
		
public class BinaryTreePreorderTraversal {
	// use Global Variables
	List<Integer> ret = new ArrayList<Integer>();
	public List<Integer> preorderTraversal (TreeNode root) {
		
		if (root == null)
			return null;
		ret.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
		
		return ret;
	}

	// use list to get result
	public void preorderTraversal1 (TreeNode root, List<Integer> ret) {
		
		if (root == null)
			return;
		ret.add(root.val);
		preorderTraversal1(root.left, ret);
		preorderTraversal1(root.right, ret);
	}
	
	public static void main(String[] args) {
		BinaryTreePreorderTraversal temp = new BinaryTreePreorderTraversal();
		
		TreeNode n0 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		
		n0.left = n2;
		n0.right = n3;
		n2.left = n4;
		n3.right = n5;
		n4.right = n6;
		
//		List<Integer> ret = new ArrayList<Integer>();	
//		temp.preorderTraversal1(n0, ret);
		
		System.out.println(temp.preorderTraversal(n0));
	}
}
