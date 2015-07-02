package leetcode;

import java.util.ArrayList;
import java.util.List;


//Given a binary tree, return the inorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [1,3,2].

public class BinaryTreeInorderTraversal {

	List<Integer> ret = new ArrayList<Integer>();
	public List<Integer> inorderTraversal (TreeNode root) {
		if (root == null)
			return null;
		inorderTraversal(root.left);
		ret.add(root.val);
		inorderTraversal(root.right);
		return ret;
	}
}
