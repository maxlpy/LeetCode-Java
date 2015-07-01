package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class BinaryTreeZigzagLevelOrderTraversal {
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return res;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int size = 0;
		boolean reverse = false;
		while (!queue.isEmpty()) {
			size = queue.size();
			ArrayList<Integer> levelNodes = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				levelNodes.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			if (reverse) {
				Collections.reverse(levelNodes);
				reverse = false;
			} else {
				reverse = true;
			}
			res.add(levelNodes);
		}
		return res;
	}
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		System.out.println(zigzagLevelOrder(node));
	}
}
