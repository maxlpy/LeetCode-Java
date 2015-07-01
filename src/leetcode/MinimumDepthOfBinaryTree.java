package leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) { //DFT
		if (root == null) return 0;
		if (root.left == null) return minDepth(root.right) + 1;
		if (root.right == null) return minDepth(root.left) + 1;
		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
	public int minDepth2(TreeNode root) { //BFT
		if (root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode flag = root;
		int depth = 1;
		while (!queue.isEmpty()) {
			if (root.left == null && root.right == null) break;
			if (root.left != null) queue.add(root.left);
			if (root.right != null) queue.add(root.right);
			if (root == flag) {
				depth++;
				flag = (root.right != null) ? root.right: root.left;
			}
		}
		return depth;
	}
}
