package leetcode;

import java.util.ArrayList;
import java.util.List;

//Given a binary tree, return the postorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [3,2,1].
		
public class BinaryTreePostorderTraversal {
	
	List<Integer> ret = new ArrayList<Integer>();
	
	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null)
			return null;
		
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			ret.add(root.val);
		return ret;
	}
	
	public static void main(String[] args) {
		BinaryTreePostorderTraversal temp = new BinaryTreePostorderTraversal();
		
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
		
		System.out.println(temp.postorderTraversal(n0));
	}
}
