package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null)
			return 0;
		
		TreeNode flag = new TreeNode(-1000);
		queue.add(root);
		queue.add(flag);
		int treeHeight = 0;  
		
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null) 
				queue.add(node.right);
			// use level flag to see if traversal is finished
			if (node.left == null && node.right == null && node.val == -1000) {
				if (queue.isEmpty())
					return ++treeHeight;
				else {
					queue.add(flag);
					++treeHeight;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		MaximumDepthofBinaryTree temp = new MaximumDepthofBinaryTree();
		
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
		
		System.out.println(temp.maxDepth(n0));
	}
}